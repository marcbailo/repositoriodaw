class Coordenada:
    def__init__(self):
        self.x: int = 0
        self.y: int = 0
    
    def moure_Dreta(self):
        self.x +x = 1   


    def moure_esquerra(self):
        self.y -= 1    

SELECT e.nom, e.cognom, c.nom_curs, p.nom_professor, ex.nota
    -> FROM estudiants e
    -> JOIN cursos c ON c.id_curs = e.id_estudiant
    -> JOIN professors p ON p.id_professor = c.id_professor
    -> WHERE ex.nota >= (
    -> SELECT AVG(nota)
    -> FROM examens
    -> WHERE id_curs = ex.id_curs 
    -> GROUP BY id_curs);



