package intro;

public class TicketMachine {
	public static void main(String[] args) {
		/*
		MealTicketSystemA ticketSystemA = new MealTicketSystemA();
        ticketSystemA.choice(1);
        ticketSystemA.buy();
        ticketSystemA.print();
        */ //-> 사용 불가
		
		MealTicketB newTicketSystem = new TicketAdapter(new MealTicketSystemA());

        newTicketSystem.choice(1);
        newTicketSystem.buyOffLine();
        newTicketSystem.print();
        try {
            System.out.println(newTicketSystem.getMenue());
        } catch (UnsupportedOperationException e) {
            System.out.println("this service is not support");
        }

        System.out.println();

        MealTicketSystemB ticketSystemB = new MealTicketSystemB();
        ticketSystemB.choice(2);
        ticketSystemB.buyOffLine();
        ticketSystemB.buyOnline();
        ticketSystemB.print();
        System.out.println(ticketSystemB.getMenue());
	}
}

interface MealTicketA {
	public void choice(int token);
	public void buy();
	public void print();
}

class MealTicketSystemA implements MealTicketA {
	@Override
    public void choice(int token) {
        System.out.println("A: selected meal ticket type is "+ token);
    }

    @Override
    public void buy() {
        System.out.println("A: meal ticket buying...");
    }

    @Override
    public void print() {
        System.out.println("A: meal ticket printing...");
    }
}

interface MealTicketB {
    public void choice(int token);

    public void print();

    public void buyOffLine();

    public void buyOnline();

    public String getMenue();
}
class MealTicketSystemB implements MealTicketB{
    @Override
    public void choice(int token) {
        System.out.println("B: selected meal ticket type is "+ token);
    }

    @Override
    public void print() {
        System.out.println("B: meal ticket printing...");
    }

    @Override
    public void buyOffLine() {
        System.out.println("B: meal ticket buying(offline)...");
    }

    @Override
    public void buyOnline() {
        System.out.println("B: meal ticket buying(online)...");
    }

    @Override
    public String getMenue() {
        return "todays menus list";
    }
}
    

class TicketAdapter implements MealTicketB {
    private MealTicketA ticket;

    public TicketAdapter(MealTicketA ticket) {
        this.ticket = ticket;
    }

    @Override
    public void choice(int token) {
        ticket.choice(token);
    }

    @Override
    public void print() {
        ticket.print();
    }

    @Override
    public void buyOffLine() {
        ticket.buy();
    }

    @Override
    public void buyOnline() {
        throw new UnsupportedOperationException("not support function (buying online");
    }

    @Override
    public String getMenue() {
        return "todays menus list";
    }
}
    