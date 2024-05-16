class Empleat:
	def __init__(self, id, nom, cognom, sou):
    	self.id = id
    	self.nom = nom
    	self.cognom = cognom
    	self.sou = sou
    
	def incrementaSou(self, quantitat):
    	self.sou += quantitat


