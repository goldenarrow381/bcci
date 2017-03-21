package bcci;

public class Player {
        private long Id;
        private String Name;
        private String Type;
        private long Score;
        private int Wickets;
        private int Catches;
        private int HalfCenturies;
        private int Centuries;
        private int DoubleCenturies;
        private String Team;
        private int Fours;
        private int Sixes;
        private int Matches;
        private int ODIs;
        private int Tests;
        private int T20;
        public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public long getScore() {
			return Score;
		}
		public void setScore(long score) {
			Score = score;
		}
		public int getWickets() {
			return Wickets;
		}
		public void setWickets(int wickets) {
			Wickets = wickets;
		}
		public int getCatches() {
			return Catches;
		}
		public void setCatches(int catches) {
			Catches = catches;
		}
		public int getHalfCenturies() {
			return HalfCenturies;
		}
		public void setHalfCenturies(int halfCenturies) {
			HalfCenturies = halfCenturies;
		}
		public int getCenturies() {
			return Centuries;
		}
		public void setCenturies(int centuries) {
			Centuries = centuries;
		}
		public int getDoubleCenturies() {
			return DoubleCenturies;
		}
		public void setDoubleCenturies(int doubleCenturies) {
			DoubleCenturies = doubleCenturies;
		}
		public String getTeam() {
			return Team;
		}
		public void setTeam(String team) {
			Team = team;
		}
		public int getFours() {
			return Fours;
		}
		public void setFours(int fours) {
			Fours = fours;
		}
		public int getSixes() {
			return Sixes;
		}
		public void setSixes(int sixes) {
			Sixes = sixes;
		}
		public int getMatches() {
			return Matches;
		}
		public void setMatches(int matches) {
			Matches = matches;
		}
		public int getODIs() {
			return ODIs;
		}
		public void setODIs(int oDIs) {
			ODIs = oDIs;
		}
		public int getTests() {
			return Tests;
		}
		public void setTests(int tests) {
			Tests = tests;
		}
		public int getT20() {
			return T20;
		}
		public void setT20(int t20) {
			T20 = t20;
		}
		
}
