package ec.solmedia.mooc.courses_counter;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import ec.solmedia.mooc.courses_counter.domain.CoursesCounter;
import ec.solmedia.mooc.courses_counter.domain.CoursesCounterRepository;
import ec.solmedia.shared.infrastructure.UnitTestCase;
import java.util.Optional;
import org.mockito.Mock;

public abstract class CoursesCounterModuleUnitTestCase extends UnitTestCase {

  @Mock
  protected CoursesCounterRepository repository;

  protected void shouldMockSearch(CoursesCounter coursesCounter) {
    when(repository.search()).thenReturn(Optional.of(coursesCounter));
  }

  protected void shouldMockSearch() {
    when(repository.search()).thenReturn(Optional.empty());
  }

  protected void shouldHaveSaved(CoursesCounter coursesCounter) {
    verify(repository, atLeastOnce()).save(coursesCounter);
  }

  protected void shouldNotHaveSaved(CoursesCounter existingCounter) {
    verify(repository, never()).save(existingCounter);
  }

}
