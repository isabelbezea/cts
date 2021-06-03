package seminar13CTS.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import seminar13CTS.TestGrupa;
import seminar13CTS.categorii.TesteGetPromovabilitate;
import seminar13CTS.categorii.TesteNormale;
import seminar13CTS.categorii.TesteUrgente;
import seminar13CTS.teste.TestGrupaWithFakeStudent;
import seminar13CTS.teste.TestGrupaWithStudentStub;
import seminar13CTS.teste.TesteGrupaCuFixture;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithStudentStub.class, TestGrupaWithFakeStudent.class, TesteGrupaCuFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class, TesteUrgente.class})
public class SuitaCustom {

}
