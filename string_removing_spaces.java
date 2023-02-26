class AA
{
public static void main(String[] arg)
{

String S=" hhhh ssss ";
char c[]=S.toCharArray();
int first=0,last=0,i;
for(i=0;i<c.length;i++)
{
if(c[i]==' ')
{
continue;
}
else
{
first=i;
break;
}

}
for(i=c.length-1;i>=0;i--)
{
if(c[i]==' ')
{
continue;
}
else
{
last=i;
break;
}
}

for(i=first;i<=last;i++)
{
System.out.print(c[i]);
}

}


}