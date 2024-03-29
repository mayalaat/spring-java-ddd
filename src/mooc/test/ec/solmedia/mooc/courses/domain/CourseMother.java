package ec.solmedia.mooc.courses.domain;

import ec.solmedia.mooc.courses.application.create.CourseCreateCommand;

public final class CourseMother {

  public static Course random() {
    return new Course(
        CourseIdMother.random(),
        CourseNameMother.random(),
        CourseDurationMother.random());
  }

  public static Course fromCommand(CourseCreateCommand request) {
    return new Course(
        new CourseId(request.id()),
        new CourseName(request.name()),
        new CourseDuration(request.duration())
    );
  }
}
