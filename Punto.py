import math

class Punto:
    G = None  

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coordenada_cartesiana(self):
        print(f"({self.x}, {self.y})")

    def coordenada_polar(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.degrees(math.atan2(self.y, self.x))
        print(f"(r={r}, θ={theta}°)")

    def leer_punto(self):
        self.x = float(input())
        self.y = float(input())

    @staticmethod
    def main():
        p = Punto(3, 4)
        p.coordenada_cartesiana()
        p.coordenada_polar()
        p.leer_punto()
        p.coordenada_cartesiana()
        p.coordenada_polar()


Punto.G = Punto(0, 0)

Punto.main()
