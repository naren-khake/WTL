<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
	<center>
      <p><b>NAME :</b><xsl:value-of select="Customer/Name"/></p>
      <p><b>ADDRESS :</b><xsl:value-of select="Customer/Address"/></p>
      <p><b>CITY :</b><xsl:value-of select="Customer/City"/></p>
      <p><b>GENDER :</b><xsl:value-of select="Customer/Gender"/></p>
        <br/><br/>
        <b>LANGUAGES KNOWN : </b>
        <ol type="1">
        <xsl:for-each select="Customer/Languages/lang">
                <li><xsl:value-of select="."/></li>
        </xsl:for-each>
        </ol>
       </center>  
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
