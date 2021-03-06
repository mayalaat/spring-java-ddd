package ec.solmedia.mooc.courses.application.create;

public final class CourseCreateRequest {

  private final String id;
  private final String name;
  private final String duration;

  public CourseCreateRequest(String id, String name, String duration) {
    this.id = id;
    this.name = name;
    this.duration = duration;
  }

  public String id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String duration() {
    return duration;
  }
}
