<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
	<head>	
<style>
th{
background-color:yellow;
color: blue;

}
table, tr, th {
border: 5px solid;
border-color: grey;
}
</style>
</head>
<body>
<h1> Mi biblioteca personal</h1>
<ul>
 <xsl:for-each select="libreria/libro">
    <li><xsl:value-of select="titulo"/></li>
    <li><xsl:value-of select="autor"/></li>
</xsl:for-each>
</ul>
<table>
<tr>
    <th>ISBN</th>
    <th> Titulo</th>
    <th>Autor</th>
    <th>Precio</th>

</tr>
<xsl:for-each select="libreria/libro" >
<tr>
    <td> <xsl:value-of select="isbn"/></td>
    <td> <xsl:value-of select="titulo"/> </td>
    <td> <xsl:value-of select="autor"/></td>
    <td> <xsl:value-of select="precio"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
