package domain.model;

import java.io.PrintStream;
import java.util.LinkedHashSet;
import java.util.Set;

public class Statement {

	private static final int TOP_OF_THE_LIST = 0;

	public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

	private Set<StatementLine> statementLines = new LinkedHashSet<StatementLine>();
	
	public void addLineContaining(Transaction transaction, Amount currentBalance) {
		statementLines.add( new StatementLine(transaction, currentBalance));
	}
	
	public void printTo(PrintStream printer) {
		printer.println(STATEMENT_HEADER);
		printStatementLines(printer);
	}

	public Set<StatementLine> getStatementLines()
	{
		return statementLines;
	}
	private void printStatementLines(PrintStream printer) {
		for (StatementLine statementLine : statementLines) {
			statementLine.printTo(printer);

		}
	}

}
