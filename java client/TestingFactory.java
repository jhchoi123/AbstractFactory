import answersend.SendAnswersCommand;
import answersend.TestingSendAnswerCommand;
import questionfind.FindQuestionCommand;
import questionfind.TestingFindQuestionCommand;

public class TestingFactory extends QuestionFactory {       // テスト用のFactory
    @Override
    public FindQuestionCommand createFindingQuestion() {
        return new TestingFindQuestionCommand();
    }

    @Override
    public SendAnswersCommand createSendingAnswers() {
        return new TestingSendAnswerCommand();
    }
}
