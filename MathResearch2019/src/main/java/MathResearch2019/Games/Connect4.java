package MathResearch2019.Games;

import java.util.ArrayList;

import com.google.gson.JsonObject;

import MathResearch2019.Errors.TurnMismatchError;

/**
 * Connect4
 */
public class Connect4 implements Game {

  public Connect4(int i, int j) {
	}

public Connect4(int i, int j, boolean b) {
}

@Override
  public boolean checkVictory() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean checkStalemateStatus() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean seeStalemateStatus() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean seeVictoryStatus() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String getBoard() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<String> possibleMoves(char turn) throws TurnMismatchError {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public char getPlayer1() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public char getPlayer2() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void setTurnTruth(char turn) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean getTurnTruth(char turn) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public JsonObject toJSON() {
    // TODO Auto-generated method stub
    return null;
  }

  
}