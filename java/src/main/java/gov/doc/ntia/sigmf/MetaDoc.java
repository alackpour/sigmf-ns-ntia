package gov.doc.ntia.sigmf;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaDoc implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id protected String id;

  protected Global global;

  protected List<Capture> captures;

  protected List<Annotation> annotations;

  private static final Logger log = LoggerFactory.getLogger(MetaDoc.class);

  /**
   * Create a MetaDoc.
   */
  public MetaDoc() {
    global = new Global();
    captures = new ArrayList<>();
    annotations = new ArrayList<>();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Capture> getCaptures() {
    return captures;
  }

  public void setCaptures(List<Capture> captures) {
    this.captures = captures;
  }

  public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public Global getGlobal() {
    return global;
  }

  /**
   * Set the Global object in the MetaDoc.
   * @param global The Global object.
   */
  public void setGlobal(Global global) {
    this.global = global;
  }

  /**
   * Save the MetaDoc to a file.
   * @param filename The full path of where to save the file.
   */
  public void saveToFile(String filename) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    try {
      mapper.writeValue(new File(filename), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void addAnnotation(Annotation annotation) {
    annotations.add(annotation);
  }

  public void addCapture(Capture capture) {
    captures.add(capture);
  }

  /**
   * Creates an Acquisition (MetaDoc + Data) by reading the data file in
   * Global dataFilePath.
   * @return the Acquisition.
   * @throws IOException when unable to read the file specified in the Global dataFilePath.
   */
  @JsonIgnore
  public Acquisition getAcquisition() throws IOException {
    Acquisition acquisition = new Acquisition();
    acquisition.setMetaDoc(this);
    log.debug("reading datafile:" + global.getDataFilePath());
    BufferedInputStream inputStream =
        new BufferedInputStream(new FileInputStream(global.getDataFilePath()));
    byte[] sensedData = IOUtils.toByteArray(inputStream);
    acquisition.setData(ByteBuffer.wrap(sensedData));
    return acquisition;
  }
}
