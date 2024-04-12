package br.com.joaocarloslima;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable {

    @FXML
    ImageView imgNave;
    @FXML
    AnchorPane pane;
    @FXML Label level;
    @FXML Label pontos;

    private int frame = 0;

    // private Jogo jogo = new Jogo();

    // public void keyHandler(KeyEvent event) {

    //     switch (event.getCode()) {
    //         case LEFT:
    //             jogo.nave.setDirecao(Direcao.ESQUERDA);
    //             jogo.nave.mover();
    //             imgNave.setLayoutX(jogo.nave.getX());
    //             break;
    //         case RIGHT:
    //             jogo.nave.setDirecao(Direcao.DIREITA);
    //             jogo.nave.mover();
    //             imgNave.setLayoutX(jogo.nave.getX());
    //             break;
    //         case SPACE:
    //             atirar();
    //             break;
    //     }
    // }

    // private void atualizar() {
    //     try {

    //         frame++;
    //         if (frame % 100 == 0) {
    //             var meteoro = jogo.criarMeteoro();
    //             pane.getChildren().add(meteoro.getImagem());
    //         }

    //         jogo.assets.forEach(asset -> {
    //             asset.mover();

    //             if(asset.getY() > 480 || asset.getY() < 0 || asset.getX() > 640 || asset.getX() < 0){
    //                 pane.getChildren().remove(asset.getImagem());
    //                 jogo.assets.remove(asset);
    //             }

    //             if (asset instanceof Tiro) {
    //                 Tiro tiro = (Tiro) asset;
    //                 jogo.assets.stream().filter(a -> a instanceof Meteoro).forEach(meteoro -> {
    //                     if (tiro.colidiuCom(meteoro)) {
    //                         ((Meteoro) meteoro).tomarTiro(tiro);
    //                         if (((Meteoro) meteoro).getPoder() <= 0) {
    //                             pane.getChildren().remove(meteoro.getImagem());
    //                             jogo.assets.remove(meteoro);
    //                             jogo.pontuar();
                                
    //                         }
    //                         pane.getChildren().remove(tiro.getImagem());
    //                         jogo.assets.remove(tiro);
    //                     }
    //                 });
    //             }

    //             ImageView img = asset.getImagem();
    //             img.setLayoutX(asset.getX());
    //             img.setLayoutY(asset.getY());
    //         });

    //         pontos.setText(jogo.getPontos() + "");
    //         level.setText(jogo.getNivel() + "");
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    // public void clockThread() {
    //     Thread thread = new Thread(() -> {
    //         while (true) {
    //             try {
    //                 Thread.sleep(20);
    //                 Platform.runLater(() -> atualizar());
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     });
    //     thread.setDaemon(true);
    //     thread.start();
    // }

    // private void atirar() {
    //     var tiro = jogo.atirar();
    //     pane.getChildren().add(tiro.getImagem());
    // }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // clockThread();
    }
}
