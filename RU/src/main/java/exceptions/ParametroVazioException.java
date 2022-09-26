package exceptions;

public class ParametroVazioException extends Exception{

		private String campoVazio;

		public ParametroVazioException(String campoVazio) {
			super(campoVazio + " não foi preenchido!!");
			this.campoVazio = campoVazio;
		}
		
}
