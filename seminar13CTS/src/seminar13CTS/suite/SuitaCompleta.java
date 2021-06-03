package seminar13CTS.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import seminar13CTS.TestGrupa;
import seminar13CTS.teste.TestGrupaWithFakeStudent;
import seminar13CTS.teste.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithFakeStudent.class, TestGrupaWithStudentStub.class, TestGrupa.class})
public class SuitaCompleta {

}
