public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    if ( fighter1.name == firstAttacker) {
            fighter2.health -= fighter1.damagePerAttack;
            return fighter2.health <= 0 ? fighter1.name : declareWinner(fighter1, fighter2, fighter2.name);
        } else {
            fighter1.health -= fighter2.damagePerAttack;
            return fighter1.health <= 0 ? fighter2.name : declareWinner(fighter1, fighter2, fighter1.name);
        }
  }
}
