import 'dart:io';

import 'package:mbzeguardx/plugins/app.dart';
import 'package:mbzeguardx/state.dart';

class Android {
  init() async {
    app?.onExit = () async {
      await globalState.appController.savePreferences();
    };
  }
}

final android = Platform.isAndroid ? Android() : null;
