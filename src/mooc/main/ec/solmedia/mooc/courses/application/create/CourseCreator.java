package ec.solmedia.mooc.courses.application.create;

import ec.solmedia.mooc.courses.domain.Course;
import ec.solmedia.mooc.courses.domain.CourseCreateRequest;
import ec.solmedia.mooc.courses.domain.CourseRepository;
import ec.solmedia.shared.domain.Service;

@Service
public final class CourseCreator {

  private final CourseRepository repository;

  public CourseCreator(CourseRepository repository) {
    this.repository = repository;
  }

  public void create(CourseCreateRequest request) {
    final var course = new Course(request.getId(), request.getName(), request.getDuration());

    repository.save(course);
  }
}
