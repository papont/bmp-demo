package com.company.bmpdemo.web.contract;

import com.company.bmpdemo.entity.Contract;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.bpm.entity.ProcAttachment;
import com.haulmont.bpm.gui.procactions.ProcActionsFrame;
import com.haulmont.cuba.gui.app.core.file.FileDownloadHelper;
import com.haulmont.cuba.gui.components.Table;

import javax.inject.Inject;

public class ContractEdit extends AbstractEditor<Contract> {
    private static final String PROCESS_CODE = "contractApproval";

    @Inject
    private ProcActionsFrame procActionsFrame;

    @Inject
    private Table<ProcAttachment> attachmentsTable;

    @Override
    public void ready() {
        FileDownloadHelper.initGeneratedColumn(attachmentsTable, "file");
        initProcActionsFrame();
    }

    private void initProcActionsFrame() {
        procActionsFrame.initializer()
                .standard()
                .init(PROCESS_CODE, getItem());
    }
}