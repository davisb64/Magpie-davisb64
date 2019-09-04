/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    //INSTANCE VARIABLES
    private boolean knowsAboutPets = false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if(statement.length() == 0) return "waga\nbaba\nbobo";
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf("dog") >= 0
                                || statement.indexOf("cat") >= 0){
                    if(!knowsAboutPets){
                        response = "Tell me more about your pets.";
                        knowsAboutPets = true;
                    }
                    else{
                        response = "I'm tired of talking about pets.";
                    }
                }
                else if (statement.indexOf("adiletta") >= 0){
                        response = "Adiletta? I haven't heard that name in "
                                + "years. *takes long drag through cigarette*";
                }
                else if (statement.indexOf("charlie") >= 0){
                        response = "CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE CHARLIE ";
                }
                else if (statement.indexOf("gamer") >= 0){
                        response = "gamers shouldn't be oppressed next question.";
                }
                else if (statement.indexOf("fortnite") >= 0){
                        response = "WE LIKE FORTNITE AAAAAUUUGHH";
                    
                }
                else if (statement.indexOf("f") >= 0){
                    response = "Respects have been paid.";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                else if (whichResponse == 4)
		{
			response = "I'm bored.";
		}
                else if (whichResponse == 5)
		{
			response = "This is response #5.";
		}
		
		return response;
	}
}
