<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Site RPG</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>



</head>

<body>

<nav class="navbar navbar-expand-lg fixed-top 
  navbar-light bg-light">
  <a class="navbar-brand" href="#" 
    style="margin-right:50px;">
      Coti Informatica
  </a>

  <button class="navbar-toggler" type="button" 
    data-toggle="collapse" data-target="#barraNavegacao"
    aria-controls="navbarText" aria-expanded="false"
    aria-label="menu toggle">
      <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="barraNavegacao">
    <div class="row">

      <!-- CAMPO DE PESQUISA -->
      <ul class="navbar-nav mr-auto">
        <li class="nav-item menu" 
        style="margin-right: 100px;">
          <form class="form-inline">
            <input class="form-control mr-sm-2"
            type="search" placeholder="Pesquisa"
            aria-label="pesquisa" style="width:500px;">
            &nbsp; 
            <button class="btn btn-outline-secondary" 
            type="submit">
              <i class="fa fa-search"></i>
            </button>
          </form>     
        </li>

        <li class="nav-item menu" style="margin-right: 100px">
          <div class="dropdown">
            <button class="btn btn-outline-secondary"
            type="button" id="botaoLogin">
              Minha Conta
            </button>

            <div class="dropdown-content">
              <div class="card shadow mb-2" style="width: 300px;">
                
                <div class="card-header">
                  Login no Site
                </div>

                <img class="card-img-top shadow mx-auto
                rounded-circle p-3 mb-5" title="Sr Data"
                src="assets/img/usuario.png" 
                style="width: 50%; margin-top: 10px;">

                <div class="card-body" style="margin-top: -50px;">
                  <form>
                    <div class="form-group">
                      <input type="email" 
                      placeholder="Digite seu Email"
                      title="Digite seu Email"
                      class="form-control" required>
                    </div>

                    <div class="form-group">
                      <input type="password"
                      placeholder="Digite sua senha"
                      title="Digite sua senha"
                      class="form-control" required>

                      <small class="form-text
                      text-muted">
                      Senha de 8 a 20 caracteres.
                      </small>
                    </div>

                    <div class="form-check">
                      <input class="form-check-input"
                      type="checkbox" value="" id="check">
                      <label class="form-check-label"
                      for="check">Lembrar-me
                      </label>
                    </div>

                    <div class="form-group">
                      <button type="submit" 
                      class="btn btn-success btn-block">
                      Login via Email
                      </button>

                      <div style="text-align: center">
                        OU
                      </div>

                      <button class="btn btn-block 
                      btn-primary" 
                      style="background-color: #2b4b90">
                      Login via Facebook
                      </button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </li>

        <li class="nav-item menu">
          <a href="#">
            <img src="assets/img/cart.png">
    <span class="badge badge-pill badge-secondary">
      0 itens
    </span>
          </a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<p id="desconto">
  Cadastre seu email e ganhe R$100 na sua primeira compra!! 
  :)
</p>

<div class="container" style="margin-top: 100px;">
  <img src="assets/img/banner.jpg"  style="width: 100%">
</div>

<div id="cadEmail" class="container" 
style="margin-top: 10px;">
  <form>
    <div class="form-row align-items-center">

      <div class="form-inline">
        <i class="fa fa-envelope fa-3x"></i>&nbsp;
        <p style="padding-top: 10px;">
          Ganhe R$100* cadastrando seu email para receber 
          a newsletter</p>
      </div>

      <div class="col-auto">
        <input type="text" class="form-control mb-2"
        placeholder="Nome" required>
      </div>

      <div class="col-auto">
        <input type="email" class="form-control mb-2"
        placeholder="Email" required>
      </div>

      <div class="col-auto">
        <button type="submit" class="btn btn-dark mb-2">
          Cadastrar
        </button>
      </div>

    </div>
  </form>
</div>



<div class="container" style="margin-top: 10px;">
  <div class="row">

    <div class="card text-white" style="width:49%">
      <img class="card-img" src="assets/img/cadeira1.jpg" 
      title="Cadeira">
      <div class="card-img-overlay" 
      style="text-align: center; margin-top: 300px">
      <h1 class="card-title" style="font-weight: bold">
        Cadeiras
      </h1>
      <h3 class="card-text">
        Venha conhecer nossas melhores e mais belas cadeiras.
      </h3>
      <button class="btn btn-outline-light btn-lg" 
      title="Clique para ver"> VEM VER
      <i class="fa fa-eye"></i>
      </button>
      </div>
    </div>

    <!--SEGUNDA IMAGEM DO CARD-->
    <div class="card text-white" style="width:49%">
        <img class="card-img" src="assets/img/cadeira2.jpg" 
        title="Cadeira">
        <div class="card-img-overlay" 
        style="text-align: center; margin-top: 300px">
        <h1 class="card-title" style="font-weight: bold">
          Cadeiras
        </h1>
        <h3 class="card-text">
          Venha conhecer nossas melhores e mais belas cadeiras.
        </h3>
        <button class="btn btn-outline-light btn-lg" 
        title="Clique para ver"> VEM VER
        <i class="fa fa-eye"></i>
        </button>
        </div>
      </div>
  </div>
</div>

<!-- BANNER -->
<div class="container" style="margin-top: 10px;">
  <div class="card bg-dark text-white">
    <div class="card-body">
      <h1 style="text-align: center;
      font-family: Handlee; font-weight: bold">
      Ganhe + 10% <span style="color: red">OFF</span>
      no Boleto
    </h1>
    </div>
  </div>
</div>



<div class="container" style="margin-top: 10px;">
  <p style="text-transform: uppercase">produtos que 
    baixaram de preco</p>
    <hr>

    <div id="carousel" class="carousel slide" 
    data-ride="carousel">
      <div class="carousel-inner">

        <div class="carousel-item active">
          <div class="row">
           
           
            <div class="card w-25">
              <img class="card-img-top img-fluid"
              src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_melina_45x45_azul_marinho_1.jpg"
              title="almofada">
              <div class="card-body">
                <h5>Almofada da Lu</h5>
                <p class="card-text">R$ 50,00</p>
              </div>
            </div>

            <div class="card w-25">
                <img class="card-img-top img-fluid"
                src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_sintonia_iv_caqui_1.jpg"
                title="almofada">
                <div class="card-body">
                  <h5>Almofada Sintonia</h5>
                  <p class="card-text">R$ 80,00</p>
                </div>
              </div>
  
              <div class="card w-25">
                  <img class="card-img-top img-fluid"
                  src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_pinda_45x45_verde_1.jpg"
                  title="almofada">
                  <div class="card-body">
                    <h5>Almofada Pinda Verde</h5>
                    <p class="card-text">R$ 30,00</p>
                  </div>
                </div>
    
                <div class="card w-25">
                    <img class="card-img-top img-fluid"
                    src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_zolly__40_laranja_1.jpg"
                    title="almofada">
                    <div class="card-body">
                      <h5>Almofada Zolly</h5>
                      <p class="card-text">R$ 50,00</p>
                    </div>
                  </div>
          </div>
        </div>





        <div class="carousel-item">
            <div class="row">
             
             
              <div class="card w-25">
                <img class="card-img-top img-fluid"
                src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_melina_45x45_azul_marinho_1.jpg"
                title="almofada">
                <div class="card-body">
                  <h5>Almofada da Lu</h5>
                  <p class="card-text">R$ 50,00</p>
                </div>
              </div>
  
              <div class="card w-25">
                  <img class="card-img-top img-fluid"
                  src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_sintonia_iv_caqui_1.jpg"
                  title="almofada">
                  <div class="card-body">
                    <h5>Almofada Sintonia</h5>
                    <p class="card-text">R$ 80,00</p>
                  </div>
                </div>
    
                <div class="card w-25">
                    <img class="card-img-top img-fluid"
                    src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_pinda_45x45_verde_1.jpg"
                    title="almofada">
                    <div class="card-body">
                      <h5>Almofada Pinda Verde</h5>
                      <p class="card-text">R$ 30,00</p>
                    </div>
                  </div>
      
                  <div class="card w-25">
                      <img class="card-img-top img-fluid"
                      src="https://secure.oppa.com.br/media/catalog/product/cache/1/image/650x522/0dc2d03fe217f8c83829496872af24a0/a/l/almofada_zolly__40_laranja_1.jpg"
                      title="almofada">
                      <div class="card-body">
                        <h5>Almofada Zolly</h5>
                        <p class="card-text">R$ 50,00</p>
                      </div>
                    </div>
            </div><!-- FECHA ROW -->
          </div><!--FECHA CAROUSEL -ITEM -->


          
      </div><!-- TERMINA CARROSSEL INNER-->

      <a class="carousel-control-prev" href="#carousel"
      role="button" data-slide="prev">
        <span class="carousel-control-prev-icon"
        aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>

      <a class="carousel-control-next" href="#carousel"
      role="button" data-slide="next">
        <span class="carousel-control-next-icon"
        aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>


    </div>
</div>
<!--  
	<div id="area">
		<form method="post" action="cadastrar.html" name="form1"
			id="formulario" class="conteudo">
			<fieldset>
				<legend>Formulario</legend>
				<br />Nome<br /> <input type="text" name="nome" size="50" value="" />
				<br />Idade<br /> <input type="text" name="idade" size="5" value="" />			
				<button type="submit">Enviar os Dados</button>
				<br />
				<br /> ${pessoa} <br /> ${msg}
			</fieldset>
			<br /> Atenção para o nome do seu projeto… <a
				href="/springmvc/listar.html" style="text-decoration: none">Consultar
				os Dados</a>
		</form>
	</div>-->
</body>
</html>