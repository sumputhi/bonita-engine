-- ------------------------------------------------ Foreign Keys -----------------------------------------------
ALTER TABLE breakpoint ADD CONSTRAINT fk_breakpoint_tenantId FOREIGN KEY (tenantid) REFERENCES tenant(id);