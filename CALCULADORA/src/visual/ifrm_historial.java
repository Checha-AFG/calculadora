
package visual;

public class ifrm_historial extends javax.swing.JInternalFrame {

    public ifrm_historial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        spn_historial = new javax.swing.JScrollPane();
        txt_showh = new javax.swing.JTextArea();

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Historial");

        txt_showh.setColumns(20);
        txt_showh.setRows(5);
        spn_historial.setViewportView(txt_showh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spn_historial, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spn_historial, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    public static javax.swing.JScrollPane spn_historial;
    public static javax.swing.JTextArea txt_showh;
}
