package tormentaRpg.criacaoPersonagem;

import java.util.List;

import tormentaRpg.manipulacaoPersonagem.ModificadorAtribulto;
import tormentaRpg.manipulacaoPersonagem.ModificadorDefesa;



public class Personagem {

	private Long id;

	// descrição personagem
	private String nomePersonagem;
	private String nomeJogador;	
	private String sexo;
	private Integer nivelPersonagem;
	private Integer idade;
	private String tamanho;
	private Integer deslocamento;
	private String corOlhos;
	private String divindade;
	private String tendencia;
	private String corCabelo;

	// Atributos originais
	private Integer originalForca;
	private Integer originalDestreza;
	private Integer originalConstituicao;
	private Integer originalInteligencia;
	private Integer originalSabedoria;
	private Integer originalCarisma;

	// Atribultos alterados
	private Integer forca;
	private Integer destreza;
	private Integer constituicao;
	private Integer inteligencia;
	private Integer sabedoria;
	private Integer carisma;

	// Modificadores de Atribultos
	private Integer modForca;
	private Integer modDestreza;
	private Integer modConstituicao;
	private Integer modInteligencia;
	private Integer modSabedoria;
	private Integer modCarisma;

	// status
	private Integer pontoVida;
	private Integer pontoMagia;
	private Integer pontoVidaAtuais;
	private Integer pontoMagiaAtuais;

	// defesa
	private Integer classeArmadura;
	private Integer defArmadura;
	private Integer defEscudo;
	private Integer modTamanhaDefesa;
	private Integer outrosDefesa;
	private Integer outrosDefesa2;

	// Resistencia
	private Integer fortitude;
	private Integer reflexo;
	private Integer vontade;
	private Integer outrosFortitude;
	private Integer outrosReflexo;
	private Integer outrosVontade;

	// Ataque
	private Integer corpoAcorpo;
	private Integer distancia;
	private Integer manobra;
	private Integer modTamanhaAtaque;
	private Integer outrosAtaque;

	// pessoal
	private Integer dinheiro;
	
	private String historia;
	private String aparencia;
	private String personalidade;
	private String notas;
	private Integer experiencia;
	
	
	//RELACIONAMENTO
	private Armadura armadura;
	private OutrosArmadura bracadeira;
	private Escudo escudo;
	private Raca raca;
	private List<Arma> armas;
	private List<Pericia> pericias;
	private List<String> idiomas;
	private List<Item> itens;
	private List<Classe> classes;	
	private List<Talento> talentos;
	private List<Magia> magias;
	
	

	

	public Personagem() {
		
	}
	
	public Personagem(Long id, String nomePersonagem, String nomeJogador, String sexo, Integer nivelPersonagem,
			Integer idade, String tamanho, Integer deslocamento, String corOlhos, String divindade, String tendencia,
			String corCabelo, Integer originalForca, Integer originalDestreza, Integer originalConstituicao,
			Integer originalInteligencia, Integer originalSabedoria, Integer originalCarisma, Integer forca,
			Integer destreza, Integer constituicao, Integer inteligencia, Integer sabedoria, Integer carisma,
			Integer modForca, Integer modDestreza, Integer modConstituicao, Integer modInteligencia,
			Integer modSabedoria, Integer modCarisma, Integer pontoVida, Integer pontoMagia, Integer pontoVidaAtuais,
			Integer pontoMagiaAtuais, Integer classeArmadura, Integer defArmadura, Integer defEscudo,
			Integer modTamanhaDefesa, Integer outrosDefesa, Integer outrosDefesa2, Integer fortitude, Integer reflexo,
			Integer vontade, Integer outrosFortitude, Integer outrosReflexo, Integer outrosVontade, Integer corpoAcorpo,
			Integer distancia, Integer manobra, Integer modTamanhaAtaque, Integer outrosAtaque, Integer dinheiro,
			String historia, String aparencia, String personalidade, String notas, Integer experiencia,
			Armadura armadura, OutrosArmadura bracadeira, Escudo escudo, Raca raca, List<Arma> armas,
			List<Pericia> pericias, List<String> idiomas, List<Item> itens, List<Classe> classes,
			List<Talento> talentos, List<Magia> magias) {
		
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
		this.originalForca = originalForca;
		this.originalDestreza = originalDestreza;
		this.originalConstituicao = originalConstituicao;
		this.originalInteligencia = originalInteligencia;
		this.originalSabedoria = originalSabedoria;
		this.originalCarisma = originalCarisma;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
		this.modForca = modForca;
		this.modDestreza = modDestreza;
		this.modConstituicao = modConstituicao;
		this.modInteligencia = modInteligencia;
		this.modSabedoria = modSabedoria;
		this.modCarisma = modCarisma;
		this.pontoVida = pontoVida;
		this.pontoMagia = pontoMagia;
		this.pontoVidaAtuais = pontoVidaAtuais;
		this.pontoMagiaAtuais = pontoMagiaAtuais;
		this.classeArmadura = classeArmadura;
		this.defArmadura = defArmadura;
		this.defEscudo = defEscudo;
		this.modTamanhaDefesa = modTamanhaDefesa;
		this.outrosDefesa = outrosDefesa;
		this.outrosDefesa2 = outrosDefesa2;
		this.fortitude = fortitude;
		this.reflexo = reflexo;
		this.vontade = vontade;
		this.outrosFortitude = outrosFortitude;
		this.outrosReflexo = outrosReflexo;
		this.outrosVontade = outrosVontade;
		this.corpoAcorpo = corpoAcorpo;
		this.distancia = distancia;
		this.manobra = manobra;
		this.modTamanhaAtaque = modTamanhaAtaque;
		this.outrosAtaque = outrosAtaque;
		this.dinheiro = dinheiro;
		this.historia = historia;
		this.aparencia = aparencia;
		this.personalidade = personalidade;
		this.notas = notas;
		this.experiencia = experiencia;
		this.armadura = armadura;
		this.bracadeira = bracadeira;
		this.escudo = escudo;
		this.raca = raca;
		this.armas = armas;
		this.pericias = pericias;
		this.idiomas = idiomas;
		this.itens = itens;
		this.classes = classes;		
		this.talentos = talentos;
		this.magias = magias;
	}


	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nomePersonagem=" + nomePersonagem + ", nomeJogador=" + nomeJogador
				+ ", sexo=" + sexo + ", nivelPersonagem=" + nivelPersonagem + ", idade=" + idade + ", tamanho="
				+ tamanho + ", deslocamento=" + deslocamento + ", corOlhos=" + corOlhos + ", divindade=" + divindade
				+ ", tendencia=" + tendencia + ", corCabelo=" + corCabelo + ", originalForca=" + originalForca
				+ ", originalDestreza=" + originalDestreza + ", originalConstituicao=" + originalConstituicao
				+ ", originalInteligencia=" + originalInteligencia + ", originalSabedoria=" + originalSabedoria
				+ ", originalCarisma=" + originalCarisma + ", forca=" + forca + ", destreza=" + destreza
				+ ", constituicao=" + constituicao + ", inteligencia=" + inteligencia + ", sabedoria=" + sabedoria
				+ ", carisma=" + carisma + ", modForca=" + modForca + ", modDestreza=" + modDestreza
				+ ", modConstituicao=" + modConstituicao + ", modInteligencia=" + modInteligencia + ", modSabedoria="
				+ modSabedoria + ", modCarisma=" + modCarisma + ", pontoVida=" + pontoVida + ", pontoMagia="
				+ pontoMagia + ", pontoVidaAtuais=" + pontoVidaAtuais + ", pontoMagiaAtuais=" + pontoMagiaAtuais
				+ ", classeArmadura=" + classeArmadura + ", defArmadura=" + defArmadura + ", defEscudo=" + defEscudo
				+ ", modTamanhaDefesa=" + modTamanhaDefesa + ", outrosDefesa=" + outrosDefesa + ", outrosDefesa2="
				+ outrosDefesa2 + ", fortitude=" + fortitude + ", reflexo=" + reflexo + ", vontade=" + vontade
				+ ", outrosFortitude=" + outrosFortitude + ", outrosReflexo=" + outrosReflexo + ", outrosVontade="
				+ outrosVontade + ", corpoAcorpo=" + corpoAcorpo + ", distancia=" + distancia + ", manobra=" + manobra
				+ ", modTamanhaAtaque=" + modTamanhaAtaque + ", outrosAtaque=" + outrosAtaque + ", dinheiro=" + dinheiro
				+ ", historia=" + historia + ", aparencia=" + aparencia + ", personalidade=" + personalidade
				+ ", notas=" + notas + ", experiencia=" + experiencia + ", armadura=" + armadura + ", bracadeira="
				+ bracadeira + ", escudo=" + escudo + ", raca=" + raca + ", armas=" + armas + ", pericias=" + pericias
				+ ", idiomas=" + idiomas + ", itens=" + itens + ", classe=" + classes + ", talentos=" + talentos 
				+ ", magias=" + magias + "]";
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	public void setBracadeira(OutrosArmadura bracadeira) {
		this.bracadeira = bracadeira;
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

	public Integer getDefArmadura() {
		return defArmadura;
	}

	public void setDefArmadura(Integer defArmadura) {
		this.defArmadura = defArmadura;
	}

	public Integer getDefEscudo() {
		return defEscudo;
	}

	public void setDefEscudo(Integer defEscudo) {
		this.defEscudo = defEscudo;
	}

	public Integer getModTamanhaDefesa() {
		return modTamanhaDefesa;
	}

	public void setModTamanhaDefesa(Integer modTamanhaDefesa) {
		this.modTamanhaDefesa = modTamanhaDefesa;
	}

	public Integer getModTamanhaAtaque() {
		return modTamanhaAtaque;
	}

	public void setModTamanhaAtaque(Integer modTamanhaAtaque) {
		this.modTamanhaAtaque = modTamanhaAtaque;
	}
	
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Magia> getMagias() {
		return magias;
	}

	public void setMagias(List<Magia> magias) {
		this.magias = magias;
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

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasse(List<Classe> classes) {
		this.classes = classes;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Integer getOriginalForca() {
		return originalForca;
	}

	public void setOriginalForca(Integer originalForca) {
		this.originalForca = originalForca;
	}

	public Integer getOriginalDestreza() {
		return originalDestreza;
	}

	public void setOriginalDestreza(Integer originalDestreza) {
		this.originalDestreza = originalDestreza;
	}

	public Integer getOriginalConstituicao() {
		return originalConstituicao;
	}

	public void setOriginalConstituicao(Integer originalConstituicao) {
		this.originalConstituicao = originalConstituicao;
	}

	public Integer getOriginalInteligencia() {
		return originalInteligencia;
	}

	public void setOriginalInteligencia(Integer originalInteligencia) {
		this.originalInteligencia = originalInteligencia;
	}

	public Integer getOriginalSabedoria() {
		return originalSabedoria;
	}

	public void setOriginalSabedoria(Integer originalSabedoria) {
		this.originalSabedoria = originalSabedoria;
	}

	public Integer getOriginalCarisma() {
		return originalCarisma;
	}

	public void setOriginalCarisma(Integer originalCarisma) {
		this.originalCarisma = originalCarisma;
	}

	public Integer getExp() {
		return experiencia;
	}

	public void setExp(Integer exp) {
		this.experiencia = exp;
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
		p.setArmadura(Armadura.listaArmaduras().get(0));
		ModificadorAtribulto.calcularModificadores(p);
		System.out.println(ModificadorDefesa.modificadorArmadura(p));
	}

}
