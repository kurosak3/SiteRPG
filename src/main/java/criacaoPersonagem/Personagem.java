	package criacaoPersonagem;

import java.util.ArrayList;
import java.util.List;

import manipulacaoPersonagem.ModificadorAtribulto;
import manipulacaoPersonagem.ModificadorDefesa;

public class Personagem {
	
	
	
	private Long id;
	
	//descrição personagem	
	private String nomePersonagem;
	private String nomeJogador;
	private String sexo ;	
	private Integer nivelPersonagem;	
	private Integer idade;
	private String tamanho;
	private Integer deslocamento;
	private String corOlhos;
	private String divindade;
	private String tendencia;
	private String corCabelo;
	
	//Atributos 	
	private Integer forca;
	private Integer destreza;
	private Integer constituicao;
	private Integer inteligencia;
	private Integer sabedoria;
	private Integer carisma;
	private Integer modForca;
	private Integer modDestreza;
	private Integer modConstituicao;
	private Integer modInteligencia;
	private Integer modSabedoria;
	private Integer modCarisma;
		
	//status
	private Integer pontoVida;
	private Integer pontoMagia;
	private Integer pontoVidaAtuais=0;
	private Integer pontoMagiaAtuais=0;
	
	//defesa
	
	private Integer classeArmadura;
	private Integer fortitude;
	private Integer reflexo;
	private Integer vontade;
	private List<Armadura> armaduras;
	
	//Ataque
	private Integer corpoAcorpo;
	private Integer distancia;
	private Integer manobra;
	private List<Arma> armas;
	
	//outros
	private Integer modTamanha;
	private Integer outrosAtaque;
	private Integer outrosDefesa;
	private Integer outrosDefesa2;
	private Integer outrosFortitude;
	private Integer outrosReflexo;
	private Integer outrosVontade;
	private Integer outrosPericia;
	
	//pessoal
	private Integer dinheiro;
	private List<String> idiomas;
	private String historia;
	private String aparencia;
	private String personalidade;
	private String notas;
	
	private List<Classe> HabilidadesDeClasse;	
	private List<Talento> talentos;
	private List<Pericia> pericias;
	
	private String classe;
	private String raca;
	
	public Personagem() {
		// TODO Auto-generated constructor stub
	}	

	public Personagem(Long id, String nomePersonagem, String nomeJogador, String sexo, Integer nivelPersonagem,
			Integer idade, String tamanho, Integer deslocamento, String corOlhos, String divindade, String tendencia,
			String corCabelo, Integer forca, Integer destreza, Integer constituicao, Integer inteligencia,
			Integer sabedoria, Integer carisma, Integer pontoVida, Integer pontoMagia, Integer classeArmadura,
			Integer fortitude, Integer reflexo, Integer vontade, List<Armadura> armaduras, Integer corpoAcorpo,
			Integer distancia, Integer manobra, List<Arma> armas, Integer dinheiro, List<String> idiomas,
			String historia, String aparencia, String personalidade, String notas, List<Classe> habilidadesDeClasse,
			List<Talento> talentos, List<Pericia> pericias, String classe, String raca) {
		super();
		this.id = id;
		this.nomePersonagem = nomePersonagem;
		this.nomeJogador = nomeJogador;
		this.sexo = sexo;
		this.nivelPersonagem = nivelPersonagem;
		this.idade = idade;
		this.tamanho = tamanho;
		this.deslocamento = deslocamento;
		this.corOlhos = corOlhos;
		this.divindade = divindade;
		this.tendencia = tendencia;
		this.corCabelo = corCabelo;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
		this.pontoVida = pontoVida;
		this.pontoMagia = pontoMagia;
		this.classeArmadura = classeArmadura;
		this.fortitude = fortitude;
		this.reflexo = reflexo;
		this.vontade = vontade;
		this.armaduras = armaduras;
		this.corpoAcorpo = corpoAcorpo;
		this.distancia = distancia;
		this.manobra = manobra;
		this.armas = armas;
		this.dinheiro = dinheiro;
		this.idiomas = idiomas;
		this.historia = historia;
		this.aparencia = aparencia;
		this.personalidade = personalidade;
		this.notas = notas;
		HabilidadesDeClasse = habilidadesDeClasse;
		this.talentos = talentos;
		this.pericias = pericias;
		this.classe = classe;
		this.raca = raca;
	}

	

	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nomePersonagem=" + nomePersonagem + ", nomeJogador=" + nomeJogador
				+ ", sexo=" + sexo + ", nivelPersonagem=" + nivelPersonagem + ", idade=" + idade + ", tamanho="
				+ tamanho + ", deslocamento=" + deslocamento + ", corOlhos=" + corOlhos + ", divindade=" + divindade
				+ ", tendencia=" + tendencia + ", corCabelo=" + corCabelo + ", forca=" + forca + ", destreza="
				+ destreza + ", constituicao=" + constituicao + ", inteligencia=" + inteligencia + ", sabedoria="
				+ sabedoria + ", carisma=" + carisma + ", modForca=" + modForca + ", modDestreza=" + modDestreza
				+ ", modConstituicao=" + modConstituicao + ", modInteligencia=" + modInteligencia + ", modSabedoria="
				+ modSabedoria + ", modCarisma=" + modCarisma + ", pontoVida=" + pontoVida + ", pontoMagia="
				+ pontoMagia + ", pontoVidaAtuais=" + pontoVidaAtuais + ", pontoMagiaAtuais=" + pontoMagiaAtuais
				+ ", classeArmadura=" + classeArmadura + ", fortitude=" + fortitude + ", reflexo=" + reflexo
				+ ", vontade=" + vontade + ", armaduras=" + armaduras + ", corpoAcorpo=" + corpoAcorpo + ", distancia="
				+ distancia + ", manobra=" + manobra + ", armas=" + armas + ", modTamanha=" + modTamanha
				+ ", outrosAtaque=" + outrosAtaque + ", outrosDefesa=" + outrosDefesa + ", outrosDefesa2="
				+ outrosDefesa2 + ", outrosFortitude=" + outrosFortitude + ", outrosReflexo=" + outrosReflexo
				+ ", outrosVontade=" + outrosVontade + ", outrosPericia=" + outrosPericia + ", dinheiro=" + dinheiro
				+ ", idiomas=" + idiomas + ", historia=" + historia + ", aparencia=" + aparencia + ", personalidade="
				+ personalidade + ", notas=" + notas + ", HabilidadesDeClasse=" + HabilidadesDeClasse + ", talentos="
				+ talentos + ", pericias=" + pericias + ", classe=" + classe + ", raca=" + raca + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public Integer getNivelPersonagem() {
		return nivelPersonagem;
	}
	public void setNivelPersonagem(Integer nivelPersonagem) {
		this.nivelPersonagem = nivelPersonagem;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Integer getDeslocamento() {
		return deslocamento;
	}
	public void setDeslocamento(Integer deslocamento) {
		this.deslocamento = deslocamento;
	}
	public String getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	public String getDivindade() {
		return divindade;
	}
	public void setDivindade(String divindade) {
		this.divindade = divindade;
	}
	public String getTendencia() {
		return tendencia;
	}
	public void setTendencia(String tendencia) {
		this.tendencia = tendencia;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	public Integer getDestreza() {
		return destreza;
	}
	public void setDestreza(Integer destreza) {
		this.destreza = destreza;						
	}
	public Integer getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(Integer constituicao) {
		this.constituicao = constituicao;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	public Integer getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(Integer sabedoria) {
		this.sabedoria = sabedoria;
	}
	public Integer getCarisma() {
		return carisma;
	}
	public void setCarisma(Integer carisma) {
		this.carisma = carisma;
	}
	public Integer getPontoVida() {
		return pontoVida;
	}
	public void setPontoVida(Integer pontoVida) {
		this.pontoVida = pontoVida;
	}
	public Integer getPontoMagia() {
		return pontoMagia;
	}
	public void setPontoMagia(Integer pontoMagia) {
		this.pontoMagia = pontoMagia;
	}
	public Integer getClasseArmadura() {
		return classeArmadura;
	}
	public void setClasseArmadura(Integer classeArmadura) {
		this.classeArmadura = classeArmadura;
	}
	public Integer getFortitude() {
		return fortitude;
	}
	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}
	public Integer getReflexo() {
		return reflexo;
	}
	public void setReflexo(Integer reflexo) {
		this.reflexo = reflexo;
	}
	public Integer getVontade() {
		return vontade;
	}
	public void setVontade(Integer vontade) {
		this.vontade = vontade;
	}
	public List<Armadura> getArmaduras() {
		return armaduras;
		
	}
	public void setArmaduras(List<Armadura> armaduras) {
		this.armaduras = armaduras;		
			Armadura a = new Armadura();
			for(int i1=0;i1<getArmaduras().size();i1++) {
				a = getArmaduras().get(i1);
				if(getDestreza()>a.getMaximoDestreza()) {
					setDestreza(a.getMaximoDestreza());
					ModificadorAtribulto.modificadorDestreza(this);
					continue;
				
			}
					
		}
	}
	public Integer getCorpoAcorpo() {
		return corpoAcorpo;
	}
	public void setCorpoAcorpo(Integer corpoAcorpo) {
		this.corpoAcorpo = corpoAcorpo;
	}
	public Integer getDistancia() {
		return distancia;
	}
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	public Integer getManobra() {
		return manobra;
	}
	public void setManobra(Integer manobra) {
		this.manobra = manobra;
	}
	public List<Arma> getArmas() {
		return armas;
	}
	public void setArmas(List<Arma> armas) {
		this.armas = armas;
	}
	public List<Classe> getHabilidadesDeClasse() {
		return HabilidadesDeClasse;
	}
	public void setHabilidadesDeClasse(List<Classe> habilidadesDeClasse) {
		HabilidadesDeClasse = habilidadesDeClasse;
	}
	public List<Talento> getTalentos() {
		return talentos;
	}
	public void setTalentos(List<Talento> talentos) {
		this.talentos = talentos;
	}
	public List<Pericia> getPericias() {
		return pericias;
	}
	public void setPericias(List<Pericia> pericias) {
		this.pericias = pericias;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}		
	public Integer getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}
	public List<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public String getAparencia() {
		return aparencia;
	}
	public void setAparencia(String aparencia) {
		this.aparencia = aparencia;
	}
	public String getPersonalidade() {
		return personalidade;
	}
	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getModForca() {
		return modForca;
	}
	public void setModForca(Integer modForca) {
		this.modForca = modForca;
	}
	public Integer getModDestreza() {
		return modDestreza;
	}
	public void setModDestreza(Integer modDestreza) {
		this.modDestreza = modDestreza;
	}
	public Integer getModConstituicao() {
		return modConstituicao;
	}
	public void setModConstituicao(Integer modConstituicao) {
		this.modConstituicao = modConstituicao;
	}
	public Integer getModInteligencia() {
		return modInteligencia;
	}
	public void setModInteligencia(Integer modInteligencia) {
		this.modInteligencia = modInteligencia;
	}
	public Integer getModSabedoria() {
		return modSabedoria;
	}
	public void setModSabedoria(Integer modSabedoria) {
		this.modSabedoria = modSabedoria;
	}
	public Integer getModCarisma() {
		return modCarisma;
	}
	public void setModCarisma(Integer modCarisma) {
		this.modCarisma = modCarisma;
	}
	public Integer getPontoVidaAtuais() {
		return pontoVidaAtuais;
	}
	public void setPontoVidaAtuais(Integer pontoVidaAtuais) {
		this.pontoVidaAtuais = pontoVidaAtuais;
	}
	public Integer getPontoMagiaAtuais() {
		return pontoMagiaAtuais;
	}
	public void setPontoMagiaAtuais(Integer pontoMagiaAtuais) {
		this.pontoMagiaAtuais = pontoMagiaAtuais;
	}
	public Integer getModTamanha() {
		return modTamanha;
	}
	public void setModTamanha(Integer modTamanha) {
		this.modTamanha = modTamanha;
	}
	public Integer getOutrosAtaque() {
		return outrosAtaque;
	}
	public void setOutrosAtaque(Integer outrosAtaque) {
		this.outrosAtaque = outrosAtaque;
	}
	public Integer getOutrosDefesa() {
		return outrosDefesa;
	}
	public void setOutrosDefesa(Integer outrosDefesa) {
		this.outrosDefesa = outrosDefesa;
	}
	public Integer getOutrosDefesa2() {
		return outrosDefesa2;
	}
	public void setOutrosDefesa2(Integer outrosDefesa2) {
		this.outrosDefesa2 = outrosDefesa2;
	}
	public Integer getOutrosFortitude() {
		return outrosFortitude;
	}
	public void setOutrosFortitude(Integer outrosFortitude) {
		this.outrosFortitude = outrosFortitude;
	}
	public Integer getOutrosReflexo() {
		return outrosReflexo;
	}
	public void setOutrosReflexo(Integer outrosReflexo) {
		this.outrosReflexo = outrosReflexo;
	}
	public Integer getOutrosVontade() {
		return outrosVontade;
	}
	public void setOutrosVontade(Integer outrosVontade) {
		this.outrosVontade = outrosVontade;
	}
	public Integer getOutrosPericia() {
		return outrosPericia;
	}
	public void setOutrosPericia(Integer outrosPericia) {
		this.outrosPericia = outrosPericia;
	}
	
	
	
	
	public static void main(String[] args) {
		Personagem p = new Personagem();
		p.setDestreza(30);
		p.setForca(18);
		p.setCarisma(15);
		p.setConstituicao(0);
		p.setInteligencia(8);
		p.setSabedoria(12);
		p.setNivelPersonagem(10);
		p.setArmaduras(Armadura.listaArmaduras());
		ModificadorAtribulto.calcularModificadores(p);
		System.out.println(ModificadorDefesa.modificadorArmadura(p));
	}
	
	
	
	

}
