package ec.solmedia.shared.domain;

public final class IntegerMother {

  public static Integer random() {
    return MotherCreator.random().number().randomDigit();
  }
}
