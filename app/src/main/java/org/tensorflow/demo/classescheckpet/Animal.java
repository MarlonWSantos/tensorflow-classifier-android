package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import org.tensorflow.demo.CameraActivity;
import org.tensorflow.demo.R;

import java.util.Objects;

import static android.app.PendingIntent.getActivity;

/**
 * Created by infoig on 06/12/2017.
 */

    //Classe que faz intermédio entre o Tensorflow e as demais classes
public class Animal  {
   private static String nome = "";
   private static int image;
   private static Context context;
   private static Animal myInstance;

        //Construtor que recebe parametros dos objetos criados no Tensorflow e nas demais classes
    public Animal(Context context){
        this.context=context;
    }

        //Permite a criação de objetos nas demais classes
    public static Animal getInstance(){
        if(myInstance==null){
            myInstance = new Animal(context);
        }
        return myInstance;
    }

        //Recebe do Tensorflow o nome do animal
    public void setNome(String nome){

            //Faz o filtro entre os tipos de animais
        switch (nome){

                //Tipos de animais reconhecidos
            case("Egyptian cat"):case("Persian cat"):case("Siamese cat"):case("tiger cat"):case("crossword puzzle"):{

                    //Cria um objeto de acordo com o animal detectado
                Gato gato = Gato.getInstance(context);

                    //Solicita nome e imagem armazenados dentro da classe do animal reconhecido
                this.nome=gato.getNomeGato();
                this.image=gato.getImagemGato();

                break;
            }
            case("Old English sheepdog"):case("French bulldog"):case("Bernese mountain dog"):case("Maltese dog"):
            case("Greater Swiss Mountain dog"):case("Eskimo dog"):case("Shetland sheepdog"):case("Labrador retriever"):
            case("Siberian husky"):case("boxer"):case("German shepherd"):case("Yorkshire terrier"):case("beagle"):
            case("Border collie"):case("standard poodle"):case("Lakeland terrier"):case("standard schnauzer"):case("Tibetan terrier"):
            case("wire-haired fox terrier"):case("basset"):case("American Staffordshire terrier"):case("Chihuahua"):case("Saint Bernard"):
            case("miniature pinscher"):case("golden retriever"):case("Chesapeake Bay retriever"):case("curly-coated retriever"):
            case("flat-coated retriever"):case("English setter"):case("Australian terrier"):case("soft-coated wheaten terrier"):
            case("Staffordshire bullterrier"):case("miniature poodle"):case("West Highland white terrier"):case("schipperke"):case("Pekinese"):
            case("Rottweiler"):case("Sealyham terrier"):case("malamute"):case("Great Dane"):case("Walker hound"):case("Welsh springer spaniel"):
            case("whippet"):case("Scottish deerhound"):case("Weimaraner"):case("Dandie Dinmont"):case("otterhound"):case("bloodhound"):
            case("Airedale"):case("giant schnauzer"):case("dalmatian"):case("black-and-tan coonhound"):case("papillon"):case("Mexican hairless"):
            case("Bouvier des Flandres"):case("malinois"):case("Lhasa"):case("Newfoundland"):case("Norwegian elkhound"):case("Saluki"):
            case("Brabancon griffon"):case("Irish wolfhound"):case("EntleBucher"):case("basenji"):case("Norfolk terrier"):case("toy terrier"):
            case("vizsla"):case("cairn"):case("groenendael"):case("clumber"):case("komondor"):case("Afghan hound"):case("Japanese spaniel"):
            case("borzoi"):case("toy poodle"):case("Kerry blue terrier"):case("Scotch terrier"):{

                Cao cao = Cao.getInstance(context);
                this.nome=cao.getNomeCao();
                this.image=cao.getImagemCao();
                break;
            }
            case("lion"):{
                Leao leao = Leao.getInstance(context);
                this.nome= leao.getNomeLeao();
                this.image= leao.getImagemLeao();
                break;
            }
            case("macaque"):case("chimpanzee"):case("guenon"):case("siamang"):case("colobus"):case("gorilla"):case("howler monkey"):
            case("capuchin"):case("marmoset"):case("gibbon"):case("proboscis monkey"):case("squirrel monkey"):case("titi"):case("spider monkey"):
            case("langur"):case("patas"):case("orangutan"):case("wig"):{
                Macaco monkey = Macaco.getInstance(context);
                this.nome=monkey.getNomeMacaco();
                this.image=monkey.getImagemMacaco();
                break;
            }
            case("gazelle"):case("impala"):case("hartebeest"):{

                Antilope antilope = Antilope.getInstance(context);
                this.nome=antilope.getNomeAntilope();
                this.image=antilope.getImagemAntilope();
                break;
            }
            case("grey whale"):case("killer whale"):{

                Baleia baleia = Baleia.getInstance(context);
                this.nome=baleia.getNomeBaleia();
                this.image=baleia.getImagemBaleia();
                break;
            }
            case("ox"):{

                Bovino bovino = Bovino.getInstance(context);
                this.nome=bovino.getNomeBovino();
                this.image=bovino.getImagemBovino();
                break;
            }
            case("bighorn"):{

                Carneiro carneiro = Carneiro.getInstance(context);
                this.nome=carneiro.getNomeCarneiro();
                this.image=carneiro.getImagemCarneiro();
                break;
            }
            case("sorrel"):{

                Cavalo cavalo = Cavalo.getInstance(context);
                this.nome=cavalo.getNomeCavalo();
                this.image=cavalo.getImagemCavalo();
                break;
            }
            case("coyote"):{

                Coiote coiote = Coiote.getInstance(context);
                this.nome=coiote.getNomeCoiote();
                this.image=coiote.getImagemCoiote();
                break;
            }
            case("African elephant"):{

                Elefante elefante = Elefante.getInstance(context);
                this.nome=elefante.getNomeElefante();
                this.image=elefante.getImagemElefante();
                break;
            }
            case("fox squirrel"):{

                Esquilo esquilo = Esquilo.getInstance(context);
                this.nome=esquilo.getNomeEsquilo();
                this.image=esquilo.getImagemEsquilo();
                break;
            }
            case("mink"):case("black-footed ferret"):case("weasel"):{

                Furao furao = Furao.getInstance(context);
                this.nome=furao.getNomeFurao();
                this.image=furao.getImagemFurao();
                break;
            }
            case("skunk"):{

                Gamba gamba = Gamba.getInstance(context);
                this.nome=gamba.getNomeGamba();
                this.image=gamba.getImagemGamba();
                break;
            }
            case("hyena"):{

                Hiena hiena = Hiena.getInstance(context);
                this.nome=hiena.getNomeHiena();
                this.image=hiena.getImagemHiena();
                break;
            }
            case("guinea pig"):{

                PorquinhoDaIndia porquinhoDaIndia = PorquinhoDaIndia.getInstance(context);
                this.nome=porquinhoDaIndia.getNomePorquinhoDaIndia();
                this.image=porquinhoDaIndia.getImagemPorquinhoDaIndia();
                break;
            }
            case("wild boar"):{

                Javali javali = Javali.getInstance(context);
                this.nome=javali.getNomeJavali();
                this.image=javali.getImagemJavali();
                break;
            }
            case("indri"):{

                Lemure lemure = Lemure.getInstance(context);
                this.nome=lemure.getNomeLemure();
                this.image=lemure.getImagemLemure();
                break;
            }
            case("red wolf"):case("white wolf"):{

                Lobo lobo = Lobo.getInstance(context);
                this.nome=lobo.getNomeLobo();
                this.image=lobo.getImagemLobo();
                break;
            }
            case("cougar"):case("jaguar"):case("leopard"):{

                Onca onca = Onca.getInstance(context);
                this.nome=onca.getNomeOnca();
                this.image=onca.getImagemOnca();
                break;
            }
            case("ram"):{

                Ovelha ovelha = Ovelha.getInstance(context);
                this.nome=ovelha.getNomeOvelha();
                this.image=ovelha.getImagemOvelha();
                break;
            }
            case("porcupine"):{

                PorcoEspinho porcoespinho = PorcoEspinho.getInstance(context);
                this.nome=porcoespinho.getNomePorcoEspinho();
                this.image=porcoespinho.getImagemPorcoEspinho();
                break;
            }
            case("three-toed sloth"):{

                Preguica preguica = Preguica.getInstance(context);
                this.nome=preguica.getNomePreguica();
                this.image=preguica.getImagemPreguica();
                break;
            }
            case("kit fox"):case("red fox"):case("grey fox"):{

                Raposa raposa = Raposa.getInstance(context);
                this.nome=raposa.getNomeRaposa();
                this.image=raposa.getImagemRaposa();
                break;
            }
            case("meerkat"):case("mongoose"):{

                Suricato suricato = Suricato.getInstance(context);
                this.nome=suricato.getNomeSuricato();
                this.image=suricato.getImagemSuricato();
                break;
            }
            case("badger"):{

                Texugo texugo = Texugo.getInstance(context);
                this.nome=texugo.getNomeTexugo();
                this.image=texugo.getImagemTexugo();
                break;
            }
            case("tiger"):{

                Tigre tigre = Tigre.getInstance(context);
                this.nome=tigre.getNomeTigre();
                this.image=tigre.getImagemTigre();
                break;
            }
            case("brown bear"):case("ice bear"):{

                Urso urso = Urso.getInstance(context);
                this.nome=urso.getNomeUrso();
                this.image=urso.getImagemUrso();
                break;
            }
            case("zebra"):{

                Zebra zebra = Zebra.getInstance(context);
                this.nome=zebra.getNomeZebra();
                this.image=zebra.getImagemZebra();
                break;
            }
                //Não sendo detecado nenhum dos animais filtrados, retorna String vazia para o Tensorflow
            default:{
                this.nome="";
            }
        }
    }
        //Retorna o nome do animal para a exibição
    public String getNomeAnimal() {
        return this.nome;
    }

        //Retorna a imagem do animal para a exibição
    public int getImageAnimal() {
        return this.image;
    }

        //Retorna o audio para execução
   public void getAudioAnimal( ){
            //Retorna o audio de acordo com o nome do animal
        switch (getNomeAnimal()){
            case("ANTILOPE"):{Antilope.getInstance(context).getAudioAntilope();break;}
            case("BALEIA"):{Baleia.getInstance(context).getAudioBaleia();break;}
            case("BOVINO"):{Bovino.getInstance(context).getAudioBovino();break;}
            case("CACHORRO"):{Cao.getInstance(context).getAudioCao();break;}
            case("CARNEIRO"):{Carneiro.getInstance(context).getAudioCarneiro();break;}
            case("CAVALO"):{Cavalo.getInstance(context).getAudioCavalo();break;}
            case("COIOTE"):{Coiote.getInstance(context).getAudioCoiote();break;}
            case("ELEFANTE"):{Elefante.getInstance(context).getAudioElefante();break;}
            case("ESQUILO"):{Esquilo.getInstance(context).getAudioEsquilo();break;}
            case("FURAO"):{Furao.getInstance(context).getAudioFurao();break;}
            case("GAMBA"):{Gamba.getInstance(context).getAudioGamba();break;}
            case("GATO"):{Gato.getInstance(context).getAudioGato();break;}
            case("HIENA"):{Hiena.getInstance(context).getAudioHiena();break;}
            case("JAVALI"):{Javali.getInstance(context).getAudioJavali();break;}
            case("LEAO"):{Leao.getInstance(context).getAudioLeao();break;}
            case("LEMURE"):{Lemure.getInstance(context).getAudioLemure();break;}
            case("LOBO"):{Lobo.getInstance(context).getAudioLobo();break;}
            case("MACACO"):{Macaco.getInstance(context).getAudioMacaco();break;}
            case("ONCA"):{Onca.getInstance(context).getAudioOnca();break;}
            case("OVELHA"):{Ovelha.getInstance(context).getAudioOvelha();break;}
            case("PORCO-ESPINHO"):{PorcoEspinho.getInstance(context).getAudioPorcoEspinho();break;}
            case("PORQUINHO-DA-INDIA"):{PorquinhoDaIndia.getInstance(context).getAudioPorquinhoDaIndia();break;}
            case("PREGUICA"):{Preguica.getInstance(context).getAudioPreguica();break;}
            case("RAPOSA"):{Raposa.getInstance(context).getAudioRaposa();break;}
            case("SURICATO"):{Suricato.getInstance(context).getAudioSuricato();break;}
            case("TEXUGO"):{Texugo.getInstance(context).getAudioTexugo();break;}
            case("TIGRE"):{Tigre.getInstance(context).getAudioTigre();break;}
            case("URSO"):{Urso.getInstance(context).getAudioUrso();break;}
            case("ZEBRA"):{Zebra.getInstance(context).getAudioZebra();break;}
            default:{}
        }
   }
}






