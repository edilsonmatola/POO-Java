import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
*
*Classe para ler dados de entrada
*@author Unknown
**/
public class InputReader
{

	/**
	 * Le um caracter, <code>char</code> do teclado
	 * @return o caracter introduzido do teclado
	 */
	public static char readChar()
	{

		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			if(line!= null && line.length() > 0)
			{
				char c = line.charAt(0);
				if(Character.isLetterOrDigit(c))
				{
					return c;
				}
			}
			System.out.println("Erro - não foi nem letra nem numero");
		}
	}

	/**
	*
	 * Le um <code>float</code> do teclado
	 * @return o valor lido do teclado
	 */
	public static float readFloat()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Float.valueOf(line.trim());
			}
			catch(NumberFormatException e)
			{
				reportError();
			}
		}
	}


	/**
	*
	 * Le um <code>double</code> do teclado
	 * @return o valor lido do teclado
	 */
	public static double readDouble()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Double.valueOf(line.trim());
			}
			catch(NumberFormatException e)
			{
				reportError();
			}
		}
	}

	/**
	 * Le um inteiro, do tipo <code>int</code> do teclado
	 * @return
	 */
	public static int readInt()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Integer.valueOf(line.trim());
			}
			catch (NumberFormatException e)
			{
				reportError();
			}
		}
	}

	/**
	 * Le um inteiro, do tipo <code>byte</code> do teclado
	 * @return
	 */
	public static byte readByte()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Byte.valueOf(line.trim());
			}
			catch (NumberFormatException e)
			{
				reportError();
			}
		}
	}


	/**
	 * Le um inteiro, do tipo <code>short</code> do teclado
	 * @return
	 */
	public static short readShort()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Short.valueOf(line.trim());
			}
			catch (NumberFormatException e)
			{
				reportError();
			}
		}
	}

	/**
	 * Le um inteiro, do tipo <code>long</code> do teclado
	 * @return
	 */
	public static long readLong()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Long.valueOf(line.trim());
			}
			catch (NumberFormatException e)
			{
				reportError();
			}
		}
	}

	/**
	 * Le um valor, do tipo <code>boolean</code> do teclado
	 * @return
	 */
	public static boolean readBoolean()
	{
		BufferedReader reader = getReader();
		while(true)
		{
			String line = readLineOrThrowRuntime(reader);
			try
			{
				return Boolean.valueOf(line.trim());
			}
			catch (NumberFormatException e)
			{
				reportError();
			}
		}
	}

	/**
	 * Le uma <code>String</code> do teclado
	 * @return A <code>String</code> lida do teclado
	 */
	public static String readString()
	{
		BufferedReader reader = getReader();
		return readLineOrThrowRuntime(reader);
	}


	private static BufferedReader getReader()
	{
		return new BufferedReader(new InputStreamReader(System.in));
	}

	private static String readLineOrThrowRuntime(BufferedReader reader)
	{
		try
		{
			return reader.readLine();
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private static void reportError()
	{
		System.out.println("Erro no numero, tente de novo");
	}
}