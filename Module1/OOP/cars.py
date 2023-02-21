class Car:
    def __init__(self, maxMove, maxMovementPerTurn):
        self.maxMove = maxMove
        self.maxMovePerTurn = maxMovementPerTurn
        self.distanceFromShed = 0
        self.distanceTravelled = 0

    def move(self, howFar):
        self.distanceFromShed += howFar
        self.distanceTravelled += abs(howFar)


myCar1 = Car(600, 12)
myCar2 = Car(460, 8)

myCar1.move(12)
myCar1.move(9)
myCar1.move(11)
myCar1.move(-12)

print(myCar1.distanceFromShed)
print(myCar1.distanceTravelled)

