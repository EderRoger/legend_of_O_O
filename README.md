# The legend of OO

**Build the game The Legend Of O.O**

**Character**

Our hero has a name, experience points?, points of attack and points of energy and finally some default items:

- Attack Equipment: Sword <Attack 11>
- Defense Equipment: Shield <Defense 10>
- Items: 1 health potion (which recovers 5 EP (energy points)) and 1 magic potion (which recovers 5 MP (magic point))

**Simple battle**

When our hero walks to a scenario, like a forest, he might find an enemy there 
and they can fight. The enemies also have a name, points of attack, points 
of defense and points of energy.

During the battle, there is some logic to calculate the damage done by a single attack: 
(DD: damage done)

- DD = Attack Points of the Attacker - Defense Points of the Defender times a random factor
- The Attack Point can be a sum of the character personal attack point times her/his attack points
- The Defense Point

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
