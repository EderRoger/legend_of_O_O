# The legend of OO

**Build the game The Legend Of O.O**

**Character**

Our hero has a name, experience points?, points of attack and points of energy and finally some default items:

- Attack Equipment: Sword <Attack 11>
- Defense Equipment: Shield <Defense 10>
- Items: 1 health potion (which recovers 5 EP (energy points))

**Simple battle**

When our hero walks to a scenario, like a forest, he might find an enemy there 
and they can fight. The enemies also have a name, points of attack, points 
of defense and points of energy.

During the battle, there is some logic to calculate the damage done by a single attack: 
(DD: damage done)

- DD(Damage Done) = Attack Points of the Attacker - Defense Points(from the enemy or vice versa)
- The Attack Point change with luck factor
  - Luck Factor is a random number (1...100) 
    - Miss (0 - 3) - Character lost the attack - No damage done
    - Normal (4 - 70) - Attack Point is a personal attack point sum - If power attack is 40, then 40 is a damage done
    - Luck (71 - 96) - Attack Point + (50% of personal attack point) - If power attack is 40, then 60 is a damage done
    - Critical (97 - 100) - Attack point is a double of the attack point - If power attack is 40, then 80 is a damage done
  
The actions a character can do in a battle, during her/his turn, are: 

- attack, 
- defend (which double your defense points) 
- use an item

The character is restricted to a single action per turn. The winner of a battle won the experience points of the defeat.

**Leveling up**
….

**The magic**
…

**The UI**

The MVP for this game will be using only text interface.
