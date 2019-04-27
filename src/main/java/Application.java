import beans.PersonEntity;
import prototype.MessageRunnerForPrototype;
import singleton.MessageRunnerForSingleton;

public class Application {
    public static void main(String[] args) {
        MessageRunnerForSingleton.messageRun();
        MessageRunnerForPrototype.messageRun();

        PersonEntity personEntity = new PersonEntity();
        personEntity.postProcessAfterInitialization(personEntity, "person");
        personEntity.postProcessBeforeInitialization(personEntity, "person1");

        personEntity.init();
        personEntity.preDestroy();
    }
}
