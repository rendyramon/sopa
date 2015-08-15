package de.sopa.manager;

import de.sopa.model.game.Level;
import de.sopa.model.game.LevelResult;
import de.sopa.scene.BaseScene;

/**
 * @author David Schilling - davejs92@gmail.com
 * @author Raphael Schilling
 */
public interface SceneService {

    BaseScene getCurrentScene();

    void createLoadingScene();

    void createMenuScene();

    void loadMenuSceneFromGameScene();

    void loadMenuSceneFromLevelChoiceScene();

    void loadLevelChoiceSceneFromMenuScene();
    void loadLevelChoiceSceneFromGameScene();

    void loadJustPlaySceneSceneFromMenuScene();

    void loadJustPlayScoreSceneSceneFromJustPlaySceneScene(Level level);

    void loadScoreScreen(final LevelResult level);
    void loadGameSceneFromLevelChoiceScene(final Level level);

    void loadLevelChoiceSceneFromScoreScene();

    void loadGameSceneFromScoreScene(Level level);

    void loadSettingsFromMenuScene();

    void loadMenuSceneFromSettingsScene();

    void loadMenuSceneFromScoreScene();

    void loadGameSceneFromGameScene(Level level);

    void loadTutorialSceneFromLevelChoiceScene();

    void loadFirstLevelFromTutorial();

    void loadLevelChoiceFromTutorial();

    void loadCreditsFromMenuScene();

    void loadMenuSceneFromCreditsScene();

    void loadMenuSceneFromJustPlayGameScene();
}
