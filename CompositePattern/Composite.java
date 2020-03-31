import java.util.ArrayList;
import java.util.List;

public class Composite implements GameUnit {
	private List<GameUnit> gameUnits = new ArrayList<>();

	@Override
	public void gameUnitInfo() {
		if(gameUnits.size() > 0){
			for(GameUnit gameUnit : gameUnits){
				gameUnit.gameUnitInfo();
			}
		}
	}
	public void addGameUnit(GameUnit gameUnit){
		gameUnits.add(gameUnit);
	}
	public void removeGameUnit(GameUnit gameUnit){
		gameUnits.remove(gameUnit);
	}
}
