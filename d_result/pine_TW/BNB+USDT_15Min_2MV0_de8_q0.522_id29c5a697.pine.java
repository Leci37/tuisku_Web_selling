//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: BNBUSDT_15Min_2MV0_29c5a697 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2MV0_29c5a697", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_29c5a697(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP_VIM <= -0.222707 )
		if( Raw_Money_Flow <= 2.38484e+06 )
			if( Negative_Money_Flow_Sum <= 1.88016e+07 )
				if( VIM <= 1.16772 )
					if( Negative_Money_Flow_Sum <= 8.72055e+06 )
						if( MFI_Low <= 18.9531 )
							if( Positive_Money_Flow <= 470033 )
								if( Negative_Money_Flow <= 864747 )
									ret := 0.023438
								if( Negative_Money_Flow > 864747 )
									ret := -0.180000
							if( Positive_Money_Flow > 470033 )
								if( Negative_Money_Flow_Sum <= 7.41292e+06 )
									ret := -0.315972
								if( Negative_Money_Flow_Sum > 7.41292e+06 )
									ret := 0.062992
						if( MFI_Low > 18.9531 )
							if( Negative_Money_Flow_Sum <= 5.83735e+06 )
								if( Positive_Money_Flow_Sum <= 4.12983e+06 )
									ret := -0.176944
								if( Positive_Money_Flow_Sum > 4.12983e+06 )
									ret := 0.214815
							if( Negative_Money_Flow_Sum > 5.83735e+06 )
								if( Raw_Money_Flow <= 909911 )
									ret := 0.419643
								if( Raw_Money_Flow > 909911 )
									ret := -0.036585
					if( Negative_Money_Flow_Sum > 8.72055e+06 )
						if( Typical_Price <= 326.3 )
							if( MFI_High <= -57.0088 )
								if( Money_Flow_Ratio <= 0.182062 )
									ret := 0.725000 // buy
								if( Money_Flow_Ratio > 0.182062 )
									ret := 0.348315
							if( MFI_High > -57.0088 )
								if( VIP_VIM <= -0.376118 )
									ret := -0.696970
								if( VIP_VIM > -0.376118 )
									ret := 0.151670
						if( Typical_Price > 326.3 )
							if( Negative_Money_Flow <= 58327.9 )
								if( MFI_Low <= 11.0446 )
									ret := -0.325397
								if( MFI_Low > 11.0446 )
									ret := -0.043836
							if( Negative_Money_Flow > 58327.9 )
								if( Money_Flow_Ratio <= 0.39718 )
									ret := 0.135593
								if( Money_Flow_Ratio > 0.39718 )
									ret := -0.070881
				if( VIM > 1.16772 )
					if( Typical_Price <= 307.659 )
						if( Negative_Money_Flow <= 1.99076e+06 )
							if( Positive_Money_Flow_Sum <= 856990 )
								if( MFI_High <= -74.7023 )
									ret := -0.642857
								if( MFI_High > -74.7023 )
									ret := -0.288136
							if( Positive_Money_Flow_Sum > 856990 )
								if( Negative_Money_Flow <= 4680.76 )
									ret := -0.031378
								if( Negative_Money_Flow > 4680.76 )
									ret := 0.074518
						if( Negative_Money_Flow > 1.99076e+06 )
							if( Money_Flow_Ratio <= 0.222132 )
								if( Positive_Money_Flow_Sum <= 2.94181e+06 )
									ret := -0.261905
								if( Positive_Money_Flow_Sum > 2.94181e+06 )
									ret := 0.909091 // buy
							if( Money_Flow_Ratio > 0.222132 )
								if( Raw_Money_Flow <= 2.28971e+06 )
									ret := -0.603774
								if( Raw_Money_Flow > 2.28971e+06 )
									ret := 0.000000
					if( Typical_Price > 307.659 )
						if( VIM <= 1.3561 )
							if( Negative_Money_Flow_Sum <= 1.75345e+07 )
								if( MFI_Low <= 3.50795 )
									ret := -0.052571
								if( MFI_Low > 3.50795 )
									ret := -0.199278
							if( Negative_Money_Flow_Sum > 1.75345e+07 )
								if( MFI_Low <= 7.73905 )
									ret := -0.637755
								if( MFI_Low > 7.73905 )
									ret := -0.144928
						if( VIM > 1.3561 )
							if( MFI_Low <= -12.401 )
								ret := 0.909091 // buy
							if( MFI_Low > -12.401 )
								ret := 0.444444
			if( Negative_Money_Flow_Sum > 1.88016e+07 )
				if( Positive_Money_Flow <= 1.08133e+06 )
					if( Positive_Money_Flow_Sum <= 1.69293e+07 )
						if( Typical_Price <= 251.267 )
							if( MFI_Low <= -2.89065 )
								if( MFI <= 8.57083 )
									ret := 0.432432
								if( MFI > 8.57083 )
									ret := -0.227273
							if( MFI_Low > -2.89065 )
								if( MFI_Low <= 6.91346 )
									ret := 0.631783
								if( MFI_Low > 6.91346 )
									ret := 0.289720
						if( Typical_Price > 251.267 )
							if( Negative_Money_Flow_Sum <= 4.65912e+07 )
								if( Positive_Money_Flow_Sum <= 1.36289e+07 )
									ret := 0.099149
								if( Positive_Money_Flow_Sum > 1.36289e+07 )
									ret := 0.385965
							if( Negative_Money_Flow_Sum > 4.65912e+07 )
								if( Negative_Money_Flow_Sum <= 5.28138e+07 )
									ret := -0.788462 // sell
								if( Negative_Money_Flow_Sum > 5.28138e+07 )
									ret := 0.421053
					if( Positive_Money_Flow_Sum > 1.69293e+07 )
						if( MFI_High <= -32.0573 )
							if( Typical_Price <= 231.959 )
								if( Typical_Price <= 226.282 )
									ret := -0.100000
								if( Typical_Price > 226.282 )
									ret := -1.000000 // sell
							if( Typical_Price > 231.959 )
								if( Negative_Money_Flow_Sum <= 3.20764e+07 )
									ret := -0.575758
								if( Negative_Money_Flow_Sum > 3.20764e+07 )
									ret := 0.083799
						if( MFI_High > -32.0573 )
							ret := 0.666667
				if( Positive_Money_Flow > 1.08133e+06 )
					if( VIP <= 0.900096 )
						if( VIM <= 1.30221 )
							if( MFI_Low <= 0.865325 )
								if( VIP <= 0.764661 )
									ret := -0.052910
								if( VIP > 0.764661 )
									ret := -0.512048
							if( MFI_Low > 0.865325 )
								if( Negative_Money_Flow <= 22853.8 )
									ret := 0.027027
								if( Negative_Money_Flow > 22853.8 )
									ret := -0.818182 // sell
						if( VIM > 1.30221 )
							if( MFI_Low <= 6.16492 )
								if( Raw_Money_Flow <= 1.7868e+06 )
									ret := 0.045455
								if( Raw_Money_Flow > 1.7868e+06 )
									ret := 0.680000
							if( MFI_Low > 6.16492 )
								if( MFI_High <= -52.6812 )
									ret := -0.866667 // sell
								if( MFI_High > -52.6812 )
									ret := -0.166667
					if( VIP > 0.900096 )
						if( Money_Flow_Ratio <= 0.591738 )
							if( Typical_Price <= 335.338 )
								if( Raw_Money_Flow <= 1.67175e+06 )
									ret := 0.761905 // buy
								if( Raw_Money_Flow > 1.67175e+06 )
									ret := 1.000000 // buy
							if( Typical_Price > 335.338 )
								if( VIM <= 1.16535 )
									ret := 0.363636
								if( VIM > 1.16535 )
									ret := 0.700000 // buy
						if( Money_Flow_Ratio > 0.591738 )
							ret := -0.052632
		if( Raw_Money_Flow > 2.38484e+06 )
			if( MFI_High <= -56.1152 )
				if( Negative_Money_Flow_Sum <= 1.83095e+08 )
					if( Positive_Money_Flow_Sum <= 1.03461e+07 )
						if( Positive_Money_Flow_Sum <= 5.22719e+06 )
							if( VIM <= 1.28022 )
								if( Negative_Money_Flow_Sum <= 2.31184e+07 )
									ret := 0.086034
								if( Negative_Money_Flow_Sum > 2.31184e+07 )
									ret := -0.207120
							if( VIM > 1.28022 )
								if( VIP_VIM <= -0.800755 )
									ret := -0.006452
								if( VIP_VIM > -0.800755 )
									ret := 0.400955
						if( Positive_Money_Flow_Sum > 5.22719e+06 )
							if( Negative_Money_Flow <= 7.79682e+06 )
								if( VIM <= 1.30788 )
									ret := 0.460401
								if( VIM > 1.30788 )
									ret := 0.193333
							if( Negative_Money_Flow > 7.79682e+06 )
								if( Negative_Money_Flow <= 1.16515e+07 )
									ret := -0.236994
								if( Negative_Money_Flow > 1.16515e+07 )
									ret := 0.562914
					if( Positive_Money_Flow_Sum > 1.03461e+07 )
						if( VIM <= 1.31369 )
							if( Negative_Money_Flow_Sum <= 1.74677e+08 )
								if( Negative_Money_Flow_Sum <= 1.13889e+08 )
									ret := 0.096509
								if( Negative_Money_Flow_Sum > 1.13889e+08 )
									ret := 0.625000
							if( Negative_Money_Flow_Sum > 1.74677e+08 )
								ret := -1.000000 // sell
						if( VIM > 1.31369 )
							if( Positive_Money_Flow_Sum <= 1.37995e+07 )
								if( Typical_Price <= 307.75 )
									ret := -0.208333
								if( Typical_Price > 307.75 )
									ret := -0.674242
							if( Positive_Money_Flow_Sum > 1.37995e+07 )
								if( Raw_Money_Flow <= 8.08834e+06 )
									ret := 0.282609
								if( Raw_Money_Flow > 8.08834e+06 )
									ret := -0.175439
				if( Negative_Money_Flow_Sum > 1.83095e+08 )
					if( Negative_Money_Flow <= 4.54408e+06 )
						ret := 0.739130 // buy
					if( Negative_Money_Flow > 4.54408e+06 )
						if( Negative_Money_Flow_Sum <= 2.58326e+08 )
							ret := 0.700000 // buy
						if( Negative_Money_Flow_Sum > 2.58326e+08 )
							ret := 1.000000 // buy
			if( MFI_High > -56.1152 )
				if( Money_Flow_Ratio <= 0.621905 )
					if( Raw_Money_Flow <= 2.39669e+06 )
						if( VIP_VIM <= -0.28099 )
							if( MFI <= 27.8011 )
								ret := 0.090909
							if( MFI > 27.8011 )
								ret := 0.578947
						if( VIP_VIM > -0.28099 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 2.39669e+06 )
						if( Negative_Money_Flow_Sum <= 2.11583e+07 )
							if( MFI_High <= -46.3567 )
								if( MFI_High <= -51.1295 )
									ret := -0.213777
								if( MFI_High > -51.1295 )
									ret := 0.163265
							if( MFI_High > -46.3567 )
								if( VIM <= 1.11581 )
									ret := 0.035088
								if( VIM > 1.11581 )
									ret := -0.590164
						if( Negative_Money_Flow_Sum > 2.11583e+07 )
							if( VIP_VIM <= -0.492872 )
								if( Negative_Money_Flow_Sum <= 3.34227e+07 )
									ret := -0.458333
								if( Negative_Money_Flow_Sum > 3.34227e+07 )
									ret := 0.000000
							if( VIP_VIM > -0.492872 )
								if( VIP <= 0.677372 )
									ret := -1.000000 // sell
								if( VIP > 0.677372 )
									ret := 0.070203
				if( Money_Flow_Ratio > 0.621905 )
					if( VIP_VIM <= -0.453888 )
						if( Negative_Money_Flow <= 2.1608e+06 )
							if( Raw_Money_Flow <= 5.07714e+06 )
								ret := -0.500000
							if( Raw_Money_Flow > 5.07714e+06 )
								if( Money_Flow_Ratio <= 0.683113 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.683113 )
									ret := -0.444444
						if( Negative_Money_Flow > 2.1608e+06 )
							ret := 0.181818
					if( VIP_VIM > -0.453888 )
						if( MFI <= 46.6638 )
							if( Raw_Money_Flow <= 6.42834e+06 )
								if( Typical_Price <= 284.519 )
									ret := 0.062500
								if( Typical_Price > 284.519 )
									ret := 0.277992
							if( Raw_Money_Flow > 6.42834e+06 )
								if( Negative_Money_Flow <= 1.36281e+07 )
									ret := 0.620939
								if( Negative_Money_Flow > 1.36281e+07 )
									ret := -0.750000 // sell
						if( MFI > 46.6638 )
							if( MFI_Low <= 34.6272 )
								if( Negative_Money_Flow_Sum <= 3.11161e+07 )
									ret := -0.321839
								if( Negative_Money_Flow_Sum > 3.11161e+07 )
									ret := 0.293103
							if( MFI_Low > 34.6272 )
								if( Raw_Money_Flow <= 6.15104e+06 )
									ret := -0.294118
								if( Raw_Money_Flow > 6.15104e+06 )
									ret := -0.733333 // sell
	if( VIP_VIM > -0.222707 )
		if( VIP_VIM <= 0.68583 )
			if( Typical_Price <= 238.139 )
				if( MFI_High <= -6.69193 )
					if( Money_Flow_Ratio <= 1.83656 )
						if( VIM <= 0.766181 )
							if( Negative_Money_Flow_Sum <= 1.11408e+07 )
								ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 1.11408e+07 )
								ret := -0.250000
						if( VIM > 0.766181 )
							if( Positive_Money_Flow_Sum <= 2.02577e+07 )
								if( Positive_Money_Flow_Sum <= 1.89924e+07 )
									ret := 0.030734
								if( Positive_Money_Flow_Sum > 1.89924e+07 )
									ret := 0.586957
							if( Positive_Money_Flow_Sum > 2.02577e+07 )
								if( VIM <= 0.842938 )
									ret := 0.444444
								if( VIM > 0.842938 )
									ret := -0.251323
					if( Money_Flow_Ratio > 1.83656 )
						if( MFI_High <= -10.1365 )
							if( VIP_VIM <= 0.341219 )
								if( Positive_Money_Flow_Sum <= 7.43776e+06 )
									ret := -0.021538
								if( Positive_Money_Flow_Sum > 7.43776e+06 )
									ret := 0.260038
							if( VIP_VIM > 0.341219 )
								if( Positive_Money_Flow <= 1.21239e+06 )
									ret := 0.560694
								if( Positive_Money_Flow > 1.21239e+06 )
									ret := 0.079365
						if( MFI_High > -10.1365 )
							if( Raw_Money_Flow <= 3.39503e+06 )
								if( VIM <= 0.829249 )
									ret := 0.164557
								if( VIM > 0.829249 )
									ret := -0.003817
							if( Raw_Money_Flow > 3.39503e+06 )
								if( Raw_Money_Flow <= 5.1172e+06 )
									ret := -0.705882 // sell
								if( Raw_Money_Flow > 5.1172e+06 )
									ret := -0.250000
				if( MFI_High > -6.69193 )
					if( Raw_Money_Flow <= 1.20695e+06 )
						if( VIP <= 1.22676 )
							if( Raw_Money_Flow <= 403314 )
								if( Positive_Money_Flow_Sum <= 2.24918e+06 )
									ret := 0.266667
								if( Positive_Money_Flow_Sum > 2.24918e+06 )
									ret := -0.154930
							if( Raw_Money_Flow > 403314 )
								if( VIM <= 0.887809 )
									ret := 0.089844
								if( VIM > 0.887809 )
									ret := 0.420000
						if( VIP > 1.22676 )
							if( Positive_Money_Flow_Sum <= 1.64356e+07 )
								if( Positive_Money_Flow_Sum <= 1.19902e+07 )
									ret := -0.219697
								if( Positive_Money_Flow_Sum > 1.19902e+07 )
									ret := 0.100000
							if( Positive_Money_Flow_Sum > 1.64356e+07 )
								if( Money_Flow_Ratio <= 4.97147 )
									ret := -0.326087
								if( Money_Flow_Ratio > 4.97147 )
									ret := -0.739130 // sell
					if( Raw_Money_Flow > 1.20695e+06 )
						if( VIM <= 0.759608 )
							if( MFI <= 89.8767 )
								if( Money_Flow_Ratio <= 3.89061 )
									ret := -0.221154
								if( Money_Flow_Ratio > 3.89061 )
									ret := 0.229299
							if( MFI > 89.8767 )
								if( Negative_Money_Flow_Sum <= 2.08606e+06 )
									ret := -0.375000
								if( Negative_Money_Flow_Sum > 2.08606e+06 )
									ret := -0.923077 // sell
						if( VIM > 0.759608 )
							if( Positive_Money_Flow_Sum <= 1.66078e+07 )
								if( Raw_Money_Flow <= 1.66589e+06 )
									ret := -0.395833
								if( Raw_Money_Flow > 1.66589e+06 )
									ret := 0.111111
							if( Positive_Money_Flow_Sum > 1.66078e+07 )
								if( Money_Flow_Ratio <= 4.01029 )
									ret := -0.390625
								if( Money_Flow_Ratio > 4.01029 )
									ret := -0.716049 // sell
			if( Typical_Price > 238.139 )
				if( Positive_Money_Flow_Sum <= 3.78354e+07 )
					if( Positive_Money_Flow <= 281812 )
						if( Negative_Money_Flow_Sum <= 1.89556e+07 )
							if( VIM <= 0.924581 )
								if( Negative_Money_Flow_Sum <= 1.2699e+07 )
									ret := 0.074549
								if( Negative_Money_Flow_Sum > 1.2699e+07 )
									ret := -0.106331
							if( VIM > 0.924581 )
								if( VIM <= 0.925641 )
									ret := -0.400000
								if( VIM > 0.925641 )
									ret := -0.000197
						if( Negative_Money_Flow_Sum > 1.89556e+07 )
							if( Raw_Money_Flow <= 2.59157e+06 )
								if( MFI <= 31.9471 )
									ret := 0.002841
								if( MFI > 31.9471 )
									ret := 0.245656
							if( Raw_Money_Flow > 2.59157e+06 )
								if( Negative_Money_Flow_Sum <= 2.08854e+07 )
									ret := 0.234043
								if( Negative_Money_Flow_Sum > 2.08854e+07 )
									ret := -0.040414
					if( Positive_Money_Flow > 281812 )
						if( Positive_Money_Flow_Sum <= 3.51452e+07 )
							if( Positive_Money_Flow_Sum <= 1.31162e+07 )
								if( Negative_Money_Flow_Sum <= 2.16418e+06 )
									ret := 0.070124
								if( Negative_Money_Flow_Sum > 2.16418e+06 )
									ret := -0.028873
							if( Positive_Money_Flow_Sum > 1.31162e+07 )
								if( MFI_High <= 13.8923 )
									ret := -0.072360
								if( MFI_High > 13.8923 )
									ret := 0.718750 // buy
						if( Positive_Money_Flow_Sum > 3.51452e+07 )
							if( Negative_Money_Flow_Sum <= 1.11229e+07 )
								if( Positive_Money_Flow <= 4.34615e+06 )
									ret := 0.703704 // buy
								if( Positive_Money_Flow > 4.34615e+06 )
									ret := -0.229167
							if( Negative_Money_Flow_Sum > 1.11229e+07 )
								if( Positive_Money_Flow <= 6.60449e+06 )
									ret := 0.162602
								if( Positive_Money_Flow > 6.60449e+06 )
									ret := -0.600000
				if( Positive_Money_Flow_Sum > 3.78354e+07 )
					if( Positive_Money_Flow <= 1.86463e+07 )
						if( MFI <= 82.0864 )
							if( Typical_Price <= 578.624 )
								if( Negative_Money_Flow_Sum <= 1.83704e+08 )
									ret := -0.125522
								if( Negative_Money_Flow_Sum > 1.83704e+08 )
									ret := -0.736111 // sell
							if( Typical_Price > 578.624 )
								if( MFI_High <= 0.884362 )
									ret := -0.294323
								if( MFI_High > 0.884362 )
									ret := 0.303030
						if( MFI > 82.0864 )
							if( Negative_Money_Flow <= 5.00381e+06 )
								if( Money_Flow_Ratio <= 11.9491 )
									ret := -0.482625
								if( Money_Flow_Ratio > 11.9491 )
									ret := 0.190476
							if( Negative_Money_Flow > 5.00381e+06 )
								if( Positive_Money_Flow_Sum <= 1.42857e+08 )
									ret := 0.367347
								if( Positive_Money_Flow_Sum > 1.42857e+08 )
									ret := -0.785714 // sell
					if( Positive_Money_Flow > 1.86463e+07 )
						if( Money_Flow_Ratio <= 1.44353 )
							if( Negative_Money_Flow_Sum <= 1.82352e+08 )
								if( MFI_Low <= 36.5984 )
									ret := 0.878788 // buy
								if( MFI_Low > 36.5984 )
									ret := 0.390244
							if( Negative_Money_Flow_Sum > 1.82352e+08 )
								ret := -0.133333
						if( Money_Flow_Ratio > 1.44353 )
							if( MFI_Low <= 65.539 )
								if( Positive_Money_Flow <= 4.16486e+07 )
									ret := -0.251397
								if( Positive_Money_Flow > 4.16486e+07 )
									ret := 0.736842 // buy
							if( MFI_Low > 65.539 )
								if( VIP <= 1.22266 )
									ret := 1.000000 // buy
								if( VIP > 1.22266 )
									ret := 0.818182 // buy
		if( VIP_VIM > 0.68583 )
			if( Typical_Price <= 586.85 )
				if( MFI_Low <= 76.8579 )
					if( Positive_Money_Flow_Sum <= 9.11577e+07 )
						if( MFI <= 76.1286 )
							if( Negative_Money_Flow_Sum <= 9.51964e+06 )
								if( Negative_Money_Flow_Sum <= 6.29226e+06 )
									ret := -0.111111
								if( Negative_Money_Flow_Sum > 6.29226e+06 )
									ret := 0.625000
							if( Negative_Money_Flow_Sum > 9.51964e+06 )
								if( Money_Flow_Ratio <= 2.75226 )
									ret := -0.090909
								if( Money_Flow_Ratio > 2.75226 )
									ret := -1.000000 // sell
						if( MFI > 76.1286 )
							if( Positive_Money_Flow_Sum <= 1.69751e+07 )
								if( Positive_Money_Flow_Sum <= 1.6136e+07 )
									ret := 0.226337
								if( Positive_Money_Flow_Sum > 1.6136e+07 )
									ret := 0.923077 // buy
							if( Positive_Money_Flow_Sum > 1.69751e+07 )
								if( Negative_Money_Flow_Sum <= 1.72329e+07 )
									ret := 0.059406
								if( Negative_Money_Flow_Sum > 1.72329e+07 )
									ret := -0.860465 // sell
					if( Positive_Money_Flow_Sum > 9.11577e+07 )
						if( Money_Flow_Ratio <= 10.9175 )
							if( VIP_VIM <= 0.782656 )
								if( VIM <= 0.592745 )
									ret := -0.500000
								if( VIM > 0.592745 )
									ret := 0.365591
							if( VIP_VIM > 0.782656 )
								if( Negative_Money_Flow_Sum <= 2.99269e+07 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 2.99269e+07 )
									ret := 1.000000 // buy
						if( Money_Flow_Ratio > 10.9175 )
							if( Positive_Money_Flow_Sum <= 1.13333e+08 )
								if( Raw_Money_Flow <= 6.68607e+06 )
									ret := 0.571429
								if( Raw_Money_Flow > 6.68607e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.13333e+08 )
								ret := 0.476190
				if( MFI_Low > 76.8579 )
					if( Typical_Price <= 322.483 )
						ret := -0.363636
					if( Typical_Price > 322.483 )
						ret := -0.937500 // sell
			if( Typical_Price > 586.85 )
				if( Money_Flow_Ratio <= 11.8431 )
					if( VIP <= 1.33518 )
						ret := -1.000000 // sell
					if( VIP > 1.33518 )
						if( VIP <= 1.36898 )
							if( MFI <= 86.8036 )
								ret := -0.466667
							if( MFI > 86.8036 )
								ret := -0.812500 // sell
						if( VIP > 1.36898 )
							if( Positive_Money_Flow <= 2.2386e+06 )
								ret := 0.000000
							if( Positive_Money_Flow > 2.2386e+06 )
								ret := -0.583333
				if( Money_Flow_Ratio > 11.8431 )
					if( Typical_Price <= 608.333 )
						ret := 0.444444
					if( Typical_Price > 608.333 )
						ret := 0.133333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_BNBUSDT_15Min_29c5a697(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


