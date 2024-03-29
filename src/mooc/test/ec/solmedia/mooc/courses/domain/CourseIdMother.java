package ec.solmedia.mooc.courses.domain;

import ec.solmedia.shared.domain.UuidMother;

public final class CourseIdMother {

  public static CourseId random() {
    return new CourseId(UuidMother.random());
  }

  public static CourseId create(String aggregateId) {
    return new CourseId(aggregateId);
  }
}
