//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: LTCUSDT_30Min_2MV0_e80e387b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_2MV0_e80e387b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_e80e387b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.07255e+07 )
		if( Raw_Money_Flow <= 8.4115e+06 )
			if( Typical_Price <= 63.1883 )
				if( VIP <= 1.02212 )
					if( Negative_Money_Flow_Sum <= 5.49321e+06 )
						if( Raw_Money_Flow <= 451377 )
							if( Negative_Money_Flow_Sum <= 4.30951e+06 )
								if( VIM <= 1.02559 )
									ret := 0.151634
								if( VIM > 1.02559 )
									ret := 0.015978
							if( Negative_Money_Flow_Sum > 4.30951e+06 )
								if( Positive_Money_Flow <= 193843 )
									ret := -0.304965
								if( Positive_Money_Flow > 193843 )
									ret := 0.123077
						if( Raw_Money_Flow > 451377 )
							if( Raw_Money_Flow <= 1.2073e+06 )
								if( VIM <= 1.08232 )
									ret := 0.220942
								if( VIM > 1.08232 )
									ret := 0.068226
							if( Raw_Money_Flow > 1.2073e+06 )
								if( Negative_Money_Flow_Sum <= 2.98306e+06 )
									ret := -0.551724
								if( Negative_Money_Flow_Sum > 2.98306e+06 )
									ret := -0.014599
					if( Negative_Money_Flow_Sum > 5.49321e+06 )
						if( MFI_Low <= 0.470459 )
							if( Typical_Price <= 57.7159 )
								if( VIP_VIM <= -0.430203 )
									ret := -0.039735
								if( VIP_VIM > -0.430203 )
									ret := -0.547619
							if( Typical_Price > 57.7159 )
								if( VIM <= 1.2499 )
									ret := 0.520833
								if( VIM > 1.2499 )
									ret := 0.119048
						if( MFI_Low > 0.470459 )
							if( Negative_Money_Flow <= 659591 )
								if( Negative_Money_Flow_Sum <= 1.06155e+07 )
									ret := 0.181492
								if( Negative_Money_Flow_Sum > 1.06155e+07 )
									ret := -0.562500
							if( Negative_Money_Flow > 659591 )
								if( MFI <= 63.168 )
									ret := 0.368932
								if( MFI > 63.168 )
									ret := -0.857143 // sell
				if( VIP > 1.02212 )
					if( Negative_Money_Flow_Sum <= 1.56241e+06 )
						if( VIP_VIM <= 0.103927 )
							if( Raw_Money_Flow <= 434911 )
								if( Positive_Money_Flow_Sum <= 1.55344e+06 )
									ret := 0.107143
								if( Positive_Money_Flow_Sum > 1.55344e+06 )
									ret := -0.174419
							if( Raw_Money_Flow > 434911 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.103927 )
							if( Positive_Money_Flow_Sum <= 1.4863e+07 )
								if( Positive_Money_Flow_Sum <= 9.85898e+06 )
									ret := 0.134598
								if( Positive_Money_Flow_Sum > 9.85898e+06 )
									ret := 0.615385
							if( Positive_Money_Flow_Sum > 1.4863e+07 )
								if( MFI_Low <= 76.0138 )
									ret := -0.875000 // sell
								if( MFI_Low > 76.0138 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.56241e+06 )
						if( VIP_VIM <= 0.495211 )
							if( VIP <= 1.219 )
								if( VIP <= 1.0855 )
									ret := 0.027086
								if( VIP > 1.0855 )
									ret := -0.065248
							if( VIP > 1.219 )
								if( Positive_Money_Flow_Sum <= 3.42584e+07 )
									ret := 0.201413
								if( Positive_Money_Flow_Sum > 3.42584e+07 )
									ret := 0.937500 // buy
						if( VIP_VIM > 0.495211 )
							if( Positive_Money_Flow <= 498003 )
								if( Negative_Money_Flow_Sum <= 2.26722e+06 )
									ret := -0.207547
								if( Negative_Money_Flow_Sum > 2.26722e+06 )
									ret := 0.059829
							if( Positive_Money_Flow > 498003 )
								if( MFI_High <= -4.98565 )
									ret := -0.043478
								if( MFI_High > -4.98565 )
									ret := -0.507692
			if( Typical_Price > 63.1883 )
				if( VIP_VIM <= -0.504591 )
					if( MFI_Low <= -4.54763 )
						if( Negative_Money_Flow <= 2.8453e+06 )
							if( VIP_VIM <= -0.624669 )
								if( VIP_VIM <= -0.732146 )
									ret := 0.000000
								if( VIP_VIM > -0.732146 )
									ret := 0.615385
							if( VIP_VIM > -0.624669 )
								if( Negative_Money_Flow_Sum <= 1.03784e+07 )
									ret := -0.050000
								if( Negative_Money_Flow_Sum > 1.03784e+07 )
									ret := 0.600000
						if( Negative_Money_Flow > 2.8453e+06 )
							ret := -1.000000 // sell
					if( MFI_Low > -4.54763 )
						if( MFI <= 21.8587 )
							if( VIP_VIM <= -0.532138 )
								if( Typical_Price <= 101.1 )
									ret := -0.504000
								if( Typical_Price > 101.1 )
									ret := -0.958333 // sell
							if( VIP_VIM > -0.532138 )
								if( VIP <= 0.718496 )
									ret := 0.545455
								if( VIP > 0.718496 )
									ret := -0.354839
						if( MFI > 21.8587 )
							if( VIP <= 0.717949 )
								if( Negative_Money_Flow_Sum <= 7.30586e+06 )
									ret := -0.259259
								if( Negative_Money_Flow_Sum > 7.30586e+06 )
									ret := 0.230769
							if( VIP > 0.717949 )
								if( Typical_Price <= 64.8864 )
									ret := 0.250000
								if( Typical_Price > 64.8864 )
									ret := -0.413333
				if( VIP_VIM > -0.504591 )
					if( Typical_Price <= 171.257 )
						if( Money_Flow_Ratio <= 4.08931 )
							if( Negative_Money_Flow <= 3.89997e+06 )
								if( Raw_Money_Flow <= 4.5846e+06 )
									ret := 0.008646
								if( Raw_Money_Flow > 4.5846e+06 )
									ret := 0.281250
							if( Negative_Money_Flow > 3.89997e+06 )
								if( VIP <= 1.03425 )
									ret := -0.222222
								if( VIP > 1.03425 )
									ret := -0.612903
						if( Money_Flow_Ratio > 4.08931 )
							if( Positive_Money_Flow_Sum <= 8.23172e+06 )
								if( Positive_Money_Flow <= 490623 )
									ret := -0.186813
								if( Positive_Money_Flow > 490623 )
									ret := -0.026316
							if( Positive_Money_Flow_Sum > 8.23172e+06 )
								if( Positive_Money_Flow_Sum <= 4.22486e+07 )
									ret := 0.152597
								if( Positive_Money_Flow_Sum > 4.22486e+07 )
									ret := -0.142077
					if( Typical_Price > 171.257 )
						if( Raw_Money_Flow <= 2.00155e+06 )
							if( Negative_Money_Flow <= 1.78983e+06 )
								if( Typical_Price <= 174.259 )
									ret := -0.394737
								if( Typical_Price > 174.259 )
									ret := 0.025463
							if( Negative_Money_Flow > 1.78983e+06 )
								if( Typical_Price <= 177.113 )
									ret := 0.900000 // buy
								if( Typical_Price > 177.113 )
									ret := 0.421053
						if( Raw_Money_Flow > 2.00155e+06 )
							if( VIP <= 1.13131 )
								if( VIP <= 1.03511 )
									ret := -0.178571
								if( VIP > 1.03511 )
									ret := -0.539216
							if( VIP > 1.13131 )
								if( VIP_VIM <= 0.311194 )
									ret := 0.291667
								if( VIP_VIM > 0.311194 )
									ret := -0.198157
		if( Raw_Money_Flow > 8.4115e+06 )
			if( VIM <= 0.439359 )
				if( VIP <= 1.40764 )
					ret := 0.166667
				if( VIP > 1.40764 )
					ret := -1.000000 // sell
			if( VIM > 0.439359 )
				if( Positive_Money_Flow <= 2.01278e+07 )
					if( VIM <= 0.573332 )
						if( Positive_Money_Flow <= 1.10039e+07 )
							if( VIM <= 0.552903 )
								if( Negative_Money_Flow_Sum <= 4.60592e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.60592e+06 )
									ret := 0.666667
							if( VIM > 0.552903 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 1.10039e+07 )
							if( Positive_Money_Flow <= 1.90491e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.90491e+07 )
								ret := 0.500000
					if( VIM > 0.573332 )
						if( Typical_Price <= 82.9092 )
							if( Negative_Money_Flow_Sum <= 6.99217e+06 )
								ret := -0.666667
							if( Negative_Money_Flow_Sum > 6.99217e+06 )
								ret := 0.750000 // buy
						if( Typical_Price > 82.9092 )
							if( Negative_Money_Flow_Sum <= 8.51408e+06 )
								if( Typical_Price <= 91.3575 )
									ret := 1.000000 // buy
								if( Typical_Price > 91.3575 )
									ret := 0.607843
							if( Negative_Money_Flow_Sum > 8.51408e+06 )
								if( MFI_High <= 6.88633 )
									ret := 0.576923
								if( MFI_High > 6.88633 )
									ret := -0.117647
				if( Positive_Money_Flow > 2.01278e+07 )
					if( VIM <= 0.610193 )
						if( Positive_Money_Flow_Sum <= 5.10757e+07 )
							ret := -0.250000
						if( Positive_Money_Flow_Sum > 5.10757e+07 )
							ret := -1.000000 // sell
					if( VIM > 0.610193 )
						ret := 0.833333 // buy
	if( Negative_Money_Flow_Sum > 1.07255e+07 )
		if( Positive_Money_Flow <= 4944.14 )
			if( Raw_Money_Flow <= 6.49649e+06 )
				if( Typical_Price <= 127.086 )
					if( Negative_Money_Flow_Sum <= 2.07942e+07 )
						if( VIP_VIM <= 0.12027 )
							if( Raw_Money_Flow <= 3.21297e+06 )
								if( Typical_Price <= 80.8218 )
									ret := 0.280986
								if( Typical_Price > 80.8218 )
									ret := 0.158097
							if( Raw_Money_Flow > 3.21297e+06 )
								if( Raw_Money_Flow <= 5.31563e+06 )
									ret := 0.478161
								if( Raw_Money_Flow > 5.31563e+06 )
									ret := -0.083333
						if( VIP_VIM > 0.12027 )
							if( Money_Flow_Ratio <= 0.96812 )
								if( VIP_VIM <= 0.173257 )
									ret := -0.621622
								if( VIP_VIM > 0.173257 )
									ret := -0.232558
							if( Money_Flow_Ratio > 0.96812 )
								if( Negative_Money_Flow_Sum <= 1.46021e+07 )
									ret := -0.008565
								if( Negative_Money_Flow_Sum > 1.46021e+07 )
									ret := 0.325843
					if( Negative_Money_Flow_Sum > 2.07942e+07 )
						if( Money_Flow_Ratio <= 1.29339 )
							if( VIP_VIM <= 0.116689 )
								if( Raw_Money_Flow <= 1.23361e+06 )
									ret := -0.179039
								if( Raw_Money_Flow > 1.23361e+06 )
									ret := 0.125897
							if( VIP_VIM > 0.116689 )
								if( VIP <= 1.1382 )
									ret := -0.621622
								if( VIP > 1.1382 )
									ret := 0.076923
						if( Money_Flow_Ratio > 1.29339 )
							if( VIP_VIM <= 0.315771 )
								if( VIP_VIM <= 0.020383 )
									ret := 0.133333
								if( VIP_VIM > 0.020383 )
									ret := 0.669492
							if( VIP_VIM > 0.315771 )
								if( Positive_Money_Flow_Sum <= 6.14389e+07 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 6.14389e+07 )
									ret := 0.470588
				if( Typical_Price > 127.086 )
					if( VIP <= 0.677485 )
						if( MFI_Low <= -9.35169 )
							if( Typical_Price <= 136.565 )
								if( VIP <= 0.576883 )
									ret := 0.000000
								if( VIP > 0.576883 )
									ret := -0.500000
							if( Typical_Price > 136.565 )
								if( VIP_VIM <= -0.676912 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.676912 )
									ret := -0.500000
						if( MFI_Low > -9.35169 )
							if( Positive_Money_Flow_Sum <= 1.30812e+07 )
								if( VIP_VIM <= -0.696813 )
									ret := 0.263158
								if( VIP_VIM > -0.696813 )
									ret := -0.533333
							if( Positive_Money_Flow_Sum > 1.30812e+07 )
								if( VIM <= 1.28412 )
									ret := 1.000000 // buy
								if( VIM > 1.28412 )
									ret := 0.250000
					if( VIP > 0.677485 )
						if( VIP_VIM <= -0.296902 )
							if( Raw_Money_Flow <= 2.22667e+06 )
								if( Raw_Money_Flow <= 1.0707e+06 )
									ret := 0.360465
								if( Raw_Money_Flow > 1.0707e+06 )
									ret := -0.049451
							if( Raw_Money_Flow > 2.22667e+06 )
								if( MFI_High <= -60.573 )
									ret := -0.056452
								if( MFI_High > -60.573 )
									ret := 0.345428
						if( VIP_VIM > -0.296902 )
							if( Money_Flow_Ratio <= 2.01053 )
								if( Negative_Money_Flow_Sum <= 1.09086e+07 )
									ret := 0.482759
								if( Negative_Money_Flow_Sum > 1.09086e+07 )
									ret := 0.053153
							if( Money_Flow_Ratio > 2.01053 )
								if( MFI_Low <= 52.5711 )
									ret := 0.337500
								if( MFI_Low > 52.5711 )
									ret := 0.017937
			if( Raw_Money_Flow > 6.49649e+06 )
				if( Typical_Price <= 175.898 )
					if( Positive_Money_Flow_Sum <= 1.61658e+07 )
						if( VIP <= 0.504169 )
							if( Typical_Price <= 88.8367 )
								if( MFI_Low <= -11.6445 )
									ret := 0.500000
								if( MFI_Low > -11.6445 )
									ret := 0.928571 // buy
							if( Typical_Price > 88.8367 )
								ret := 0.000000
						if( VIP > 0.504169 )
							if( VIM <= 1.25365 )
								if( MFI_Low <= -4.55736 )
									ret := 0.500000
								if( MFI_Low > -4.55736 )
									ret := 0.047619
							if( VIM > 1.25365 )
								if( Positive_Money_Flow_Sum <= 1.15614e+07 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.15614e+07 )
									ret := 0.666667
					if( Positive_Money_Flow_Sum > 1.61658e+07 )
						if( Positive_Money_Flow_Sum <= 3.02934e+07 )
							if( Raw_Money_Flow <= 9.08544e+06 )
								if( Typical_Price <= 116.539 )
									ret := 0.084337
								if( Typical_Price > 116.539 )
									ret := 0.596491
							if( Raw_Money_Flow > 9.08544e+06 )
								if( Negative_Money_Flow_Sum <= 5.05148e+07 )
									ret := 0.540541
								if( Negative_Money_Flow_Sum > 5.05148e+07 )
									ret := 0.823009 // buy
						if( Positive_Money_Flow_Sum > 3.02934e+07 )
							if( MFI_Low <= 41.4642 )
								if( VIP <= 1.21388 )
									ret := 0.314376
								if( VIP > 1.21388 )
									ret := -0.785714 // sell
							if( MFI_Low > 41.4642 )
								if( Positive_Money_Flow_Sum <= 1.16347e+08 )
									ret := 0.712707 // buy
								if( Positive_Money_Flow_Sum > 1.16347e+08 )
									ret := -0.090909
				if( Typical_Price > 175.898 )
					if( VIP_VIM <= -0.408171 )
						if( MFI_Low <= -6.34806 )
							if( VIP_VIM <= -0.597976 )
								if( Typical_Price <= 184.508 )
									ret := 0.500000
								if( Typical_Price > 184.508 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.597976 )
								if( MFI_High <= -71.4304 )
									ret := 0.916667 // buy
								if( MFI_High > -71.4304 )
									ret := -0.125000
						if( MFI_Low > -6.34806 )
							if( Typical_Price <= 198.121 )
								if( Positive_Money_Flow_Sum <= 2.74108e+07 )
									ret := -0.034483
								if( Positive_Money_Flow_Sum > 2.74108e+07 )
									ret := 0.526316
							if( Typical_Price > 198.121 )
								if( VIM <= 1.21764 )
									ret := 0.437500
								if( VIM > 1.21764 )
									ret := 0.782051 // buy
					if( VIP_VIM > -0.408171 )
						if( MFI_Low <= 6.61685 )
							if( Negative_Money_Flow <= 7.97884e+06 )
								if( MFI <= 25.3881 )
									ret := 1.000000 // buy
								if( MFI > 25.3881 )
									ret := -0.111111
							if( Negative_Money_Flow > 7.97884e+06 )
								if( VIP <= 0.857071 )
									ret := -0.302632
								if( VIP > 0.857071 )
									ret := -0.846154 // sell
						if( MFI_Low > 6.61685 )
							if( VIP_VIM <= 0.041503 )
								if( MFI_High <= -33.2829 )
									ret := 0.120198
								if( MFI_High > -33.2829 )
									ret := -0.188034
							if( VIP_VIM > 0.041503 )
								if( VIM <= 0.846992 )
									ret := 0.104651
								if( VIM > 0.846992 )
									ret := 0.332703
		if( Positive_Money_Flow > 4944.14 )
			if( Typical_Price <= 182.112 )
				if( Typical_Price <= 52.5017 )
					if( MFI_High <= -70.3681 )
						ret := -1.000000 // sell
					if( MFI_High > -70.3681 )
						if( Positive_Money_Flow_Sum <= 1.91031e+07 )
							if( VIP <= 1.04872 )
								if( VIP_VIM <= -0.377367 )
									ret := 0.128205
								if( VIP_VIM > -0.377367 )
									ret := 0.594937
							if( VIP > 1.04872 )
								if( VIM <= 0.881924 )
									ret := -0.250000
								if( VIM > 0.881924 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.91031e+07 )
							if( Raw_Money_Flow <= 3.07754e+06 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 3.07754e+06 )
								ret := 0.750000 // buy
				if( Typical_Price > 52.5017 )
					if( Positive_Money_Flow_Sum <= 5.19605e+07 )
						if( MFI <= 66.4649 )
							if( MFI <= 63.7067 )
								if( VIM <= 1.0175 )
									ret := -0.031997
								if( VIM > 1.0175 )
									ret := 0.049121
							if( MFI > 63.7067 )
								if( VIP <= 1.02522 )
									ret := 0.840000 // buy
								if( VIP > 1.02522 )
									ret := 0.219512
						if( MFI > 66.4649 )
							if( Typical_Price <= 67.5912 )
								if( VIM <= 0.809702 )
									ret := 1.000000 // buy
								if( VIM > 0.809702 )
									ret := 0.636364
							if( Typical_Price > 67.5912 )
								if( Positive_Money_Flow_Sum <= 2.62017e+07 )
									ret := -0.614286
								if( Positive_Money_Flow_Sum > 2.62017e+07 )
									ret := -0.111675
					if( Positive_Money_Flow_Sum > 5.19605e+07 )
						if( Typical_Price <= 100.88 )
							if( Positive_Money_Flow_Sum <= 9.37648e+07 )
								if( Money_Flow_Ratio <= 1.18196 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 1.18196 )
									ret := 0.462810
							if( Positive_Money_Flow_Sum > 9.37648e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 100.88 )
							if( Raw_Money_Flow <= 1.26834e+07 )
								if( Positive_Money_Flow_Sum <= 1.02781e+08 )
									ret := 0.197740
								if( Positive_Money_Flow_Sum > 1.02781e+08 )
									ret := -0.218182
							if( Raw_Money_Flow > 1.26834e+07 )
								if( Positive_Money_Flow_Sum <= 5.29436e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 5.29436e+07 )
									ret := -0.208333
			if( Typical_Price > 182.112 )
				if( Negative_Money_Flow_Sum <= 1.79308e+08 )
					if( Raw_Money_Flow <= 2.07792e+07 )
						if( Typical_Price <= 183.208 )
							if( Negative_Money_Flow_Sum <= 1.91013e+07 )
								if( Negative_Money_Flow_Sum <= 1.50219e+07 )
									ret := -0.368421
								if( Negative_Money_Flow_Sum > 1.50219e+07 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 1.91013e+07 )
								if( Negative_Money_Flow_Sum <= 2.36131e+07 )
									ret := -0.838710 // sell
								if( Negative_Money_Flow_Sum > 2.36131e+07 )
									ret := -0.328125
						if( Typical_Price > 183.208 )
							if( Typical_Price <= 372.618 )
								if( VIP_VIM <= -0.078136 )
									ret := 0.042723
								if( VIP_VIM > -0.078136 )
									ret := -0.081410
							if( Typical_Price > 372.618 )
								if( MFI <= 76.1218 )
									ret := -0.869565 // sell
								if( MFI > 76.1218 )
									ret := 0.000000
					if( Raw_Money_Flow > 2.07792e+07 )
						if( Raw_Money_Flow <= 7.70733e+07 )
							if( VIM <= 1.14364 )
								if( Positive_Money_Flow_Sum <= 2.5519e+08 )
									ret := 0.453333
								if( Positive_Money_Flow_Sum > 2.5519e+08 )
									ret := 0.000000
							if( VIM > 1.14364 )
								if( Positive_Money_Flow_Sum <= 8.5564e+07 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 8.5564e+07 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 7.70733e+07 )
							if( MFI_High <= 6.39534 )
								ret := -1.000000 // sell
							if( MFI_High > 6.39534 )
								ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 1.79308e+08 )
					if( VIM <= 1.15132 )
						if( Negative_Money_Flow_Sum <= 3.27376e+08 )
							if( Negative_Money_Flow <= 1.78618e+07 )
								if( Positive_Money_Flow_Sum <= 1.27683e+08 )
									ret := -0.675676
								if( Positive_Money_Flow_Sum > 1.27683e+08 )
									ret := -0.955882 // sell
							if( Negative_Money_Flow > 1.78618e+07 )
								ret := 0.666667
						if( Negative_Money_Flow_Sum > 3.27376e+08 )
							if( Money_Flow_Ratio <= 0.732889 )
								if( Negative_Money_Flow <= 651671 )
									ret := 0.166667
								if( Negative_Money_Flow > 651671 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.732889 )
								ret := -1.000000 // sell
					if( VIM > 1.15132 )
						if( Negative_Money_Flow_Sum <= 2.11628e+08 )
							if( Positive_Money_Flow_Sum <= 5.77911e+07 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 5.77911e+07 )
								if( Money_Flow_Ratio <= 0.589774 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.589774 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 2.11628e+08 )
							if( VIM <= 1.23794 )
								if( Raw_Money_Flow <= 1.704e+07 )
									ret := 0.615385
								if( Raw_Money_Flow > 1.704e+07 )
									ret := 1.000000 // buy
							if( VIM > 1.23794 )
								if( MFI_High <= -59.5954 )
									ret := -1.000000 // sell
								if( MFI_High > -59.5954 )
									ret := 0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_LTCUSDT_30Min_e80e387b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


