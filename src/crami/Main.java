package crami;

/* i'm writing this because i feel bad and i want to change this situation
 * right now! i wish is i had some money so that i can continue my studies
 * but, it seems like there's no other way except selling my time for some
 * amount of money!
 * 
 * today, i want to create a new future! I would release this game and hope
 * that i would make some money..
 * 
 * Amen! (Shit! i'm not a believer!) */

public class Main {
	public static void main(String[] args) {
		Debug.On( );

		System.out.println(new Card(Card.BACK.BLUE, Card.RANK.ACE,
				Card.SUIT.CLUBS, 10).checkJoker(Game.TYPE.SIMPLE,
				new Card(Card.BACK.BLUE, Card.RANK.ACE, Card.SUIT.DIAMONDS, 9))
				.toString( ));

		run( );
	}

	public static void run() {
		new Game(Game.TYPE.TALAJ, new Player[] {
				new Player("foo"), new Player("bar"), new Player("baz")
		}).startGame( );

	}

}
