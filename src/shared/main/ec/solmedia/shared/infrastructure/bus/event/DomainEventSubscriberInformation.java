package ec.solmedia.shared.infrastructure.bus.event;

import ec.solmedia.shared.domain.NamingUtil;
import ec.solmedia.shared.domain.event.bus.DomainEvent;
import java.util.List;

public final class DomainEventSubscriberInformation {

  private final Class<?> subscriberClass;
  private final List<Class<? extends DomainEvent>> subscribedEvents;

  public DomainEventSubscriberInformation(
      Class<?> subscriberClass,
      List<Class<? extends DomainEvent>> subscribedEvents
  ) {
    this.subscriberClass = subscriberClass;
    this.subscribedEvents = subscribedEvents;
  }

  public Class<?> subscriberClass() {
    return subscriberClass;
  }

  public String contextName() {
    String[] nameParts = subscriberClass.getName().split("\\.");

    return nameParts[2];
  }

  public String moduleName() {
    String[] nameParts = subscriberClass.getName().split("\\.");

    return nameParts[3];
  }

  public String className() {
    String[] nameParts = subscriberClass.getName().split("\\.");

    return nameParts[nameParts.length - 1];
  }

  public List<Class<? extends DomainEvent>> subscribedEvents() {
    return subscribedEvents;
  }

  public String formatRabbitMqQueueName() {
    return String.format("solmedia.%s.%s.%s", contextName(), moduleName(),
        NamingUtil.toSnake(className()));
  }
}
