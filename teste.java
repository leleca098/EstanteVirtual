public class teste {
    Cannot invoke "java.util.Properties.getProperty(String)" because "properties" is null
        at conexão_dados.Conexao.<init>(Conexao.java:31)
        at Usuario.Cad_userDAO.cadastrarUsuario(Cad_userDAO.java:20)   
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:251)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:101)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
java.lang.NullPointerException: Cannot invoke "java.util.Properties.getProperty(String)" because "properties" is null
        at conexão_dados.Conexao.<init>(Conexao.java:31)
        at Usuario.Cad_userDAO.cadastrarUsuario(Cad_userDAO.java:20)
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:251)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:101)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
PS C:\Users\kayky\Downloads\EstanteVirtual>  c:; cd 'c:\Users\kayky\Downloads\EstanteVirtual'; & 'C:\Users\kayky\.vscode\extensions\redhat.java-1.24.0-win32-x64\jre\17.0.8.1-win32-x86_64\bin\java.exe' '@C:\Users\kayky\AppData\Local\Temp\cp_cphfadjj7dir7wbgt7yr1pka1.argfile' 'Run.Run' 
java.lang.NumberFormatException: For input string: "12345678910"
        at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:224)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:101)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
PS C:\Users\kayky\Downloads\EstanteVirtual>  c:; cd 'c:\Users\kayky\Downloads\EstanteVirtual'; & 'C:\Users\kayky\.vscode\extensions\redhat.java-1.24.0-win32-x64\jre\17.0.8.1-win32-x86_64\bin\java.exe' '@C:\Users\kayky\AppData\Local\Temp\cp_cphfadjj7dir7wbgt7yr1pka1.argfile' 'Run.Run' 
Corinthians
null
java.lang.NullPointerException: Cannot invoke "java.util.Properties.getProperty(String)" because "properties" is null
        at conexão_dados.Conexao.<init>(Conexao.java:31)
        at Usuario.Cad_userDAO.cadastrarUsuario(Cad_userDAO.java:23)
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:251)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:101)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
PS C:\Users\kayky\Downloads\EstanteVirtual>  c:; cd 'c:\Users\kayky\Downloads\EstanteVirtual'; & 'C:\Users\kayky\.vscode\extensions\redhat.java-1.24.0-win32-x64\jre\17.0.8.1-win32-x86_64\bin\java.exe' '@C:\Users\kayky\AppData\Local\Temp\cp_cphfadjj7dir7wbgt7yr1pka1.argfile' 'Run.Run' 
mingau
{DB_PORT=16457, DB_USER=avnadmin, DB_NAME=defaultdb, DB_HOST=mysql-29950f77-erickandrighetti.a.aivencloud.com, DB_PASSWORD=AVNS_EugJaLGYymyOgG3yuk3}
Corinthians
null
java.lang.NullPointerException: Cannot invoke "java.util.Properties.getProperty(String)" because "properties" is null
        at conexão_dados.Conexao.<init>(Conexao.java:31)
        at Usuario.Cad_userDAO.cadastrarUsuario(Cad_userDAO.java:23)
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:254)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:104)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
PS C:\Users\kayky\Downloads\EstanteVirtual>
                                          >  c:; cd 'c:\Users\kayky\Downloads\EstanteVirtual'; & 'C:\Users\kayky\.vscode\extensions\redhat.java-1.24.0-win32-x64\jre\17.0.8.1-win32-x86_64\bin\java.exe' '@C:\Users\kayky\AppData\Local\Temp\cp_cphfadjj7dir7wbgt7yr1pka1.argfile' 'Run.Run' 
mingau
{DB_PORT=16457, DB_USER=avnadmin, DB_NAME=defaultdb, DB_HOST=mysql-29950f77-erickandrighetti.a.aivencloud.com, DB_PASSWORD=AVNS_EugJaLGYymyOgG3yuk3}
Corinthians
null
java.lang.NullPointerException: Cannot invoke "java.util.Properties.getProperty(String)" because "properties" is null
        at conexão_dados.Conexao.<init>(Conexao.java:31)
        at Usuario.Cad_userDAO.cadastrarUsuario(Cad_userDAO.java:23)
        at Telas.Cadastro.criarButtonActionPerformed(Cadastro.java:254)
        at Telas.Cadastro$3.actionPerformed(Cadastro.java:104)
        at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
        at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
        at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
        at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
        at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.Component.processEvent(Unknown Source)
        at java.desktop/java.awt.Container.processEvent(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
        at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
        at java.base/java.security.AccessController.doPrivileged(Unknown Source)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
        at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
        at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
}