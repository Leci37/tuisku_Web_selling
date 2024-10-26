//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: ATOMUSDT_15Min_2MV0_2b3957c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2MV0_2b3957c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_2b3957c8(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.19482e+06 )
		if( MFI_Low <= 70.7552 )
			if( VIP <= 1.02132 )
				if( Negative_Money_Flow <= 127505 )
					if( Positive_Money_Flow_Sum <= 1.13428e+06 )
						if( Positive_Money_Flow_Sum <= 452581 )
							if( Typical_Price <= 4.94 )
								if( Raw_Money_Flow <= 60052.8 )
									ret := 0.106880
								if( Raw_Money_Flow > 60052.8 )
									ret := -0.070845
							if( Typical_Price > 4.94 )
								if( MFI_Low <= -13.9132 )
									ret := -0.750000 // sell
								if( MFI_Low > -13.9132 )
									ret := -0.071317
						if( Positive_Money_Flow_Sum > 452581 )
							if( MFI_Low <= 41.8921 )
								if( VIM <= 0.982802 )
									ret := 0.100690
								if( VIM > 0.982802 )
									ret := -0.014983
							if( MFI_Low > 41.8921 )
								if( Typical_Price <= 4.98283 )
									ret := 0.567568
								if( Typical_Price > 4.98283 )
									ret := 0.107558
					if( Positive_Money_Flow_Sum > 1.13428e+06 )
						if( Negative_Money_Flow_Sum <= 1.05881e+06 )
							if( Raw_Money_Flow <= 344713 )
								if( Money_Flow_Ratio <= 1.2073 )
									ret := -0.379310
								if( Money_Flow_Ratio > 1.2073 )
									ret := 0.057072
							if( Raw_Money_Flow > 344713 )
								if( VIP_VIM <= 0.040336 )
									ret := -0.157895
								if( VIP_VIM > 0.040336 )
									ret := -0.591837
						if( Negative_Money_Flow_Sum > 1.05881e+06 )
							if( Positive_Money_Flow <= 204001 )
								if( MFI <= 59.8103 )
									ret := -0.548913
								if( MFI > 59.8103 )
									ret := -0.076923
							if( Positive_Money_Flow > 204001 )
								if( Positive_Money_Flow_Sum <= 2.24799e+06 )
									ret := 0.038462
								if( Positive_Money_Flow_Sum > 2.24799e+06 )
									ret := -1.000000 // sell
				if( Negative_Money_Flow > 127505 )
					if( Positive_Money_Flow_Sum <= 332290 )
						if( Typical_Price <= 8.19909 )
							if( Money_Flow_Ratio <= 0.167401 )
								if( Money_Flow_Ratio <= 0.041589 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.041589 )
									ret := -0.459459
							if( Money_Flow_Ratio > 0.167401 )
								if( Raw_Money_Flow <= 273394 )
									ret := 0.004808
								if( Raw_Money_Flow > 273394 )
									ret := 0.385965
						if( Typical_Price > 8.19909 )
							if( Money_Flow_Ratio <= 0.490117 )
								if( Typical_Price <= 8.26662 )
									ret := -1.000000 // sell
								if( Typical_Price > 8.26662 )
									ret := -0.149485
							if( Money_Flow_Ratio > 0.490117 )
								if( VIM <= 1.09252 )
									ret := -0.777778 // sell
								if( VIM > 1.09252 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 332290 )
						if( Positive_Money_Flow_Sum <= 1.35554e+06 )
							if( Negative_Money_Flow_Sum <= 645252 )
								if( Raw_Money_Flow <= 151652 )
									ret := 0.126582
								if( Raw_Money_Flow > 151652 )
									ret := -0.299213
							if( Negative_Money_Flow_Sum > 645252 )
								if( VIM <= 0.98181 )
									ret := -0.026201
								if( VIM > 0.98181 )
									ret := 0.201258
						if( Positive_Money_Flow_Sum > 1.35554e+06 )
							if( VIP_VIM <= 0.057757 )
								if( Raw_Money_Flow <= 131823 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 131823 )
									ret := -0.340741
							if( VIP_VIM > 0.057757 )
								if( Raw_Money_Flow <= 221967 )
									ret := -0.285714
								if( Raw_Money_Flow > 221967 )
									ret := 0.588235
			if( VIP > 1.02132 )
				if( Positive_Money_Flow_Sum <= 7.21822e+06 )
					if( Positive_Money_Flow_Sum <= 2.93285e+06 )
						if( Negative_Money_Flow_Sum <= 452029 )
							if( Positive_Money_Flow <= 193152 )
								if( MFI_Low <= 59.5636 )
									ret := 0.011096
								if( MFI_Low > 59.5636 )
									ret := 0.110895
							if( Positive_Money_Flow > 193152 )
								if( Positive_Money_Flow_Sum <= 2.07664e+06 )
									ret := -0.217391
								if( Positive_Money_Flow_Sum > 2.07664e+06 )
									ret := 0.241667
						if( Negative_Money_Flow_Sum > 452029 )
							if( VIP_VIM <= 0.183434 )
								if( Positive_Money_Flow <= 58947.6 )
									ret := 0.041341
								if( Positive_Money_Flow > 58947.6 )
									ret := -0.030041
							if( VIP_VIM > 0.183434 )
								if( Positive_Money_Flow_Sum <= 1.36067e+06 )
									ret := 0.057050
								if( Positive_Money_Flow_Sum > 1.36067e+06 )
									ret := 0.136632
					if( Positive_Money_Flow_Sum > 2.93285e+06 )
						if( Negative_Money_Flow_Sum <= 736326 )
							if( Positive_Money_Flow <= 403579 )
								if( Positive_Money_Flow_Sum <= 2.98018e+06 )
									ret := -0.592593
								if( Positive_Money_Flow_Sum > 2.98018e+06 )
									ret := 0.067729
							if( Positive_Money_Flow > 403579 )
								if( Typical_Price <= 13.3469 )
									ret := 0.528796
								if( Typical_Price > 13.3469 )
									ret := -0.296296
						if( Negative_Money_Flow_Sum > 736326 )
							if( Positive_Money_Flow_Sum <= 3.52348e+06 )
								if( Positive_Money_Flow_Sum <= 2.97099e+06 )
									ret := 0.138889
								if( Positive_Money_Flow_Sum > 2.97099e+06 )
									ret := -0.370614
							if( Positive_Money_Flow_Sum > 3.52348e+06 )
								if( MFI_Low <= 61.0327 )
									ret := 0.202564
								if( MFI_Low > 61.0327 )
									ret := -0.184713
				if( Positive_Money_Flow_Sum > 7.21822e+06 )
					if( Typical_Price <= 12.904 )
						if( Negative_Money_Flow_Sum <= 932257 )
							if( VIP_VIM <= 0.723094 )
								if( Typical_Price <= 11.4343 )
									ret := -0.250000
								if( Typical_Price > 11.4343 )
									ret := 1.000000 // buy
							if( VIP_VIM > 0.723094 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 932257 )
							if( VIM <= 0.758079 )
								if( VIM <= 0.654151 )
									ret := 0.612903
								if( VIM > 0.654151 )
									ret := 0.941176 // buy
							if( VIM > 0.758079 )
								ret := 0.000000
					if( Typical_Price > 12.904 )
						if( Typical_Price <= 14.2796 )
							if( VIP <= 1.27512 )
								if( MFI_High <= 9.0469 )
									ret := -0.500000
								if( MFI_High > 9.0469 )
									ret := -1.000000 // sell
							if( VIP > 1.27512 )
								ret := 0.000000
						if( Typical_Price > 14.2796 )
							if( Typical_Price <= 15.3981 )
								ret := 0.250000
							if( Typical_Price > 15.3981 )
								ret := 1.000000 // buy
		if( MFI_Low > 70.7552 )
			if( Positive_Money_Flow <= 1.6337e+06 )
				if( Raw_Money_Flow <= 144598 )
					if( Raw_Money_Flow <= 72470 )
						if( VIM <= 0.715 )
							if( VIM <= 0.667296 )
								if( Positive_Money_Flow_Sum <= 1.54265e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.54265e+06 )
									ret := -0.250000
							if( VIM > 0.667296 )
								if( Typical_Price <= 6.739 )
									ret := -1.000000 // sell
								if( Typical_Price > 6.739 )
									ret := -0.333333
						if( VIM > 0.715 )
							if( Typical_Price <= 6.79467 )
								if( Raw_Money_Flow <= 39263.5 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 39263.5 )
									ret := 0.000000
							if( Typical_Price > 6.79467 )
								ret := 0.000000
					if( Raw_Money_Flow > 72470 )
						if( Negative_Money_Flow_Sum <= 108381 )
							if( Negative_Money_Flow_Sum <= 67626.1 )
								if( Typical_Price <= 5.91967 )
									ret := 0.250000
								if( Typical_Price > 5.91967 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 67626.1 )
								if( VIP_VIM <= 0.558683 )
									ret := 0.000000
								if( VIP_VIM > 0.558683 )
									ret := 0.866667 // buy
						if( Negative_Money_Flow_Sum > 108381 )
							if( Positive_Money_Flow <= 125812 )
								if( VIP_VIM <= 0.783474 )
									ret := 0.000000
								if( VIP_VIM > 0.783474 )
									ret := -0.250000
							if( Positive_Money_Flow > 125812 )
								ret := -0.500000
				if( Raw_Money_Flow > 144598 )
					if( VIP <= 1.33784 )
						if( Positive_Money_Flow <= 963278 )
							if( Negative_Money_Flow_Sum <= 991183 )
								if( Positive_Money_Flow_Sum <= 9.8397e+06 )
									ret := -0.317308
								if( Positive_Money_Flow_Sum > 9.8397e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 991183 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 963278 )
							if( Typical_Price <= 9.33963 )
								ret := -1.000000 // sell
							if( Typical_Price > 9.33963 )
								if( Positive_Money_Flow_Sum <= 1.19097e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.19097e+07 )
									ret := -0.600000
					if( VIP > 1.33784 )
						if( VIM <= 0.519809 )
							if( MFI_Low <= 75.8736 )
								if( Raw_Money_Flow <= 1.26666e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.26666e+06 )
									ret := 0.750000 // buy
							if( MFI_Low > 75.8736 )
								ret := -1.000000 // sell
						if( VIM > 0.519809 )
							if( Raw_Money_Flow <= 425195 )
								if( Positive_Money_Flow_Sum <= 6.38653e+06 )
									ret := -0.413793
								if( Positive_Money_Flow_Sum > 6.38653e+06 )
									ret := 0.400000
							if( Raw_Money_Flow > 425195 )
								if( Positive_Money_Flow_Sum <= 8.89914e+06 )
									ret := -0.568182
								if( Positive_Money_Flow_Sum > 8.89914e+06 )
									ret := -0.846154 // sell
			if( Positive_Money_Flow > 1.6337e+06 )
				if( VIM <= 0.412022 )
					ret := 0.500000
				if( VIM > 0.412022 )
					if( VIP <= 1.21626 )
						ret := -0.250000
					if( VIP > 1.21626 )
						if( Raw_Money_Flow <= 4.39861e+06 )
							if( MFI_Low <= 78.1314 )
								if( VIP_VIM <= 0.680535 )
									ret := -0.909091 // sell
								if( VIP_VIM > 0.680535 )
									ret := -1.000000 // sell
							if( MFI_Low > 78.1314 )
								ret := -0.750000 // sell
						if( Raw_Money_Flow > 4.39861e+06 )
							ret := -0.750000 // sell
	if( Negative_Money_Flow_Sum > 1.19482e+06 )
		if( MFI <= 38.0506 )
			if( Raw_Money_Flow <= 1.21915e+06 )
				if( Negative_Money_Flow_Sum <= 6.91898e+06 )
					if( Money_Flow_Ratio <= 0.075797 )
						if( Typical_Price <= 11.3707 )
							if( Negative_Money_Flow <= 787039 )
								if( VIP <= 0.437959 )
									ret := -0.285714
								if( VIP > 0.437959 )
									ret := 0.568047
							if( Negative_Money_Flow > 787039 )
								if( Negative_Money_Flow_Sum <= 6.2202e+06 )
									ret := -0.700000 // sell
								if( Negative_Money_Flow_Sum > 6.2202e+06 )
									ret := 0.666667
						if( Typical_Price > 11.3707 )
							if( VIP <= 0.672773 )
								if( Positive_Money_Flow_Sum <= 283965 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 283965 )
									ret := 0.833333 // buy
							if( VIP > 0.672773 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.075797 )
						if( Negative_Money_Flow_Sum <= 6.80896e+06 )
							if( Positive_Money_Flow_Sum <= 1.33342e+06 )
								if( Typical_Price <= 12.8591 )
									ret := 0.086344
								if( Typical_Price > 12.8591 )
									ret := -0.098340
							if( Positive_Money_Flow_Sum > 1.33342e+06 )
								if( Raw_Money_Flow <= 674174 )
									ret := 0.164695
								if( Raw_Money_Flow > 674174 )
									ret := -0.026008
						if( Negative_Money_Flow_Sum > 6.80896e+06 )
							if( Money_Flow_Ratio <= 0.471568 )
								if( Negative_Money_Flow <= 875879 )
									ret := 0.200000
								if( Negative_Money_Flow > 875879 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.471568 )
								if( MFI_Low <= 16.8349 )
									ret := -0.882353 // sell
								if( MFI_Low > 16.8349 )
									ret := -0.166667
				if( Negative_Money_Flow_Sum > 6.91898e+06 )
					if( Positive_Money_Flow_Sum <= 2.58479e+06 )
						if( Money_Flow_Ratio <= 0.252106 )
							if( Negative_Money_Flow_Sum <= 9.50904e+06 )
								if( Typical_Price <= 10.4885 )
									ret := 0.193939
								if( Typical_Price > 10.4885 )
									ret := 0.434783
							if( Negative_Money_Flow_Sum > 9.50904e+06 )
								if( MFI <= 10.7286 )
									ret := 0.486486
								if( MFI > 10.7286 )
									ret := -0.201439
						if( Money_Flow_Ratio > 0.252106 )
							if( Raw_Money_Flow <= 1.19148e+06 )
								if( VIP_VIM <= -0.152477 )
									ret := 0.715481 // buy
								if( VIP_VIM > -0.152477 )
									ret := 0.083333
							if( Raw_Money_Flow > 1.19148e+06 )
								ret := -0.600000
					if( Positive_Money_Flow_Sum > 2.58479e+06 )
						if( MFI_High <= -51.3073 )
							if( Typical_Price <= 11.8821 )
								if( MFI <= 20.3694 )
									ret := -0.296296
								if( MFI > 20.3694 )
									ret := 0.213793
							if( Typical_Price > 11.8821 )
								if( Negative_Money_Flow_Sum <= 7.9888e+06 )
									ret := -0.789474 // sell
								if( Negative_Money_Flow_Sum > 7.9888e+06 )
									ret := -0.049587
						if( MFI_High > -51.3073 )
							if( Negative_Money_Flow_Sum <= 9.9441e+06 )
								if( Typical_Price <= 14.0172 )
									ret := 0.226306
								if( Typical_Price > 14.0172 )
									ret := -0.242038
							if( Negative_Money_Flow_Sum > 9.9441e+06 )
								if( VIP <= 0.992493 )
									ret := 0.611538
								if( VIP > 0.992493 )
									ret := -0.692308
			if( Raw_Money_Flow > 1.21915e+06 )
				if( Raw_Money_Flow <= 1.86007e+06 )
					if( Positive_Money_Flow_Sum <= 490870 )
						if( VIM <= 1.29119 )
							if( VIP <= 0.625968 )
								if( Raw_Money_Flow <= 1.33847e+06 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 1.33847e+06 )
									ret := -1.000000 // sell
							if( VIP > 0.625968 )
								if( Typical_Price <= 7.79317 )
									ret := -0.500000
								if( Typical_Price > 7.79317 )
									ret := 0.000000
						if( VIM > 1.29119 )
							if( Typical_Price <= 10.1621 )
								ret := 0.750000 // buy
							if( Typical_Price > 10.1621 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 490870 )
						if( VIM <= 0.904281 )
							if( VIP <= 0.925138 )
								ret := -1.000000 // sell
							if( VIP > 0.925138 )
								ret := -0.250000
						if( VIM > 0.904281 )
							if( Negative_Money_Flow <= 1.46329e+06 )
								if( MFI_Low <= 8.28628 )
									ret := 0.257353
								if( MFI_Low > 8.28628 )
									ret := 0.552174
							if( Negative_Money_Flow > 1.46329e+06 )
								if( VIM <= 1.02867 )
									ret := 0.157895
								if( VIM > 1.02867 )
									ret := 0.697819
				if( Raw_Money_Flow > 1.86007e+06 )
					if( Negative_Money_Flow_Sum <= 2.30073e+07 )
						if( Negative_Money_Flow_Sum <= 1.59006e+07 )
							if( Negative_Money_Flow_Sum <= 1.12676e+07 )
								if( Positive_Money_Flow_Sum <= 749531 )
									ret := -0.324324
								if( Positive_Money_Flow_Sum > 749531 )
									ret := 0.271242
							if( Negative_Money_Flow_Sum > 1.12676e+07 )
								if( VIP <= 0.900743 )
									ret := 0.622047
								if( VIP > 0.900743 )
									ret := -0.857143 // sell
						if( Negative_Money_Flow_Sum > 1.59006e+07 )
							if( Negative_Money_Flow <= 7.33318e+06 )
								if( Positive_Money_Flow <= 2.8253e+06 )
									ret := -0.575342
								if( Positive_Money_Flow > 2.8253e+06 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow > 7.33318e+06 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.30073e+07 )
						if( Typical_Price <= 17.7195 )
							if( Typical_Price <= 12.1692 )
								if( Typical_Price <= 8.77204 )
									ret := 0.000000
								if( Typical_Price > 8.77204 )
									ret := 0.867647 // buy
							if( Typical_Price > 12.1692 )
								if( Raw_Money_Flow <= 2.97134e+06 )
									ret := 0.666667
								if( Raw_Money_Flow > 2.97134e+06 )
									ret := -0.250000
						if( Typical_Price > 17.7195 )
							ret := -1.000000 // sell
		if( MFI > 38.0506 )
			if( Typical_Price <= 11.7996 )
				if( Positive_Money_Flow_Sum <= 1.13104e+07 )
					if( VIP <= 1.22467 )
						if( Raw_Money_Flow <= 952706 )
							if( Positive_Money_Flow_Sum <= 7.90621e+06 )
								if( Positive_Money_Flow_Sum <= 2.29307e+06 )
									ret := 0.116791
								if( Positive_Money_Flow_Sum > 2.29307e+06 )
									ret := 0.047623
							if( Positive_Money_Flow_Sum > 7.90621e+06 )
								if( Raw_Money_Flow <= 476898 )
									ret := 0.687500
								if( Raw_Money_Flow > 476898 )
									ret := 0.178694
						if( Raw_Money_Flow > 952706 )
							if( Negative_Money_Flow_Sum <= 1.05137e+07 )
								if( MFI <= 42.2563 )
									ret := -0.448819
								if( MFI > 42.2563 )
									ret := -0.062268
							if( Negative_Money_Flow_Sum > 1.05137e+07 )
								if( Money_Flow_Ratio <= 0.727976 )
									ret := -0.064516
								if( Money_Flow_Ratio > 0.727976 )
									ret := 0.727273 // buy
					if( VIP > 1.22467 )
						if( Money_Flow_Ratio <= 1.24616 )
							if( Positive_Money_Flow_Sum <= 5.68297e+06 )
								if( Typical_Price <= 6.34633 )
									ret := -1.000000 // sell
								if( Typical_Price > 6.34633 )
									ret := -0.108108
							if( Positive_Money_Flow_Sum > 5.68297e+06 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.24616 )
							if( MFI_Low <= 41.3925 )
								if( Positive_Money_Flow_Sum <= 3.12494e+06 )
									ret := 0.309524
								if( Positive_Money_Flow_Sum > 3.12494e+06 )
									ret := 0.788462 // buy
							if( MFI_Low > 41.3925 )
								if( Typical_Price <= 9.1665 )
									ret := 0.360119
								if( Typical_Price > 9.1665 )
									ret := 0.164498
				if( Positive_Money_Flow_Sum > 1.13104e+07 )
					if( Positive_Money_Flow_Sum <= 1.29755e+07 )
						if( VIP <= 1.19515 )
							if( Typical_Price <= 9.22843 )
								if( Typical_Price <= 7.565 )
									ret := -0.666667
								if( Typical_Price > 7.565 )
									ret := 0.800000 // buy
							if( Typical_Price > 9.22843 )
								if( Raw_Money_Flow <= 2.54564e+06 )
									ret := -0.436782
								if( Raw_Money_Flow > 2.54564e+06 )
									ret := 0.368421
						if( VIP > 1.19515 )
							if( Raw_Money_Flow <= 443229 )
								if( Positive_Money_Flow <= 149516 )
									ret := 0.333333
								if( Positive_Money_Flow > 149516 )
									ret := -0.888889 // sell
							if( Raw_Money_Flow > 443229 )
								if( VIP <= 1.39564 )
									ret := -0.824176 // sell
								if( VIP > 1.39564 )
									ret := 0.200000
					if( Positive_Money_Flow_Sum > 1.29755e+07 )
						if( MFI_High <= -6.24449 )
							if( VIP <= 0.849093 )
								ret := 1.000000 // buy
							if( VIP > 0.849093 )
								if( Negative_Money_Flow_Sum <= 1.43612e+07 )
									ret := -0.110294
								if( Negative_Money_Flow_Sum > 1.43612e+07 )
									ret := -0.583333
						if( MFI_High > -6.24449 )
							if( Negative_Money_Flow_Sum <= 2.87068e+06 )
								if( Positive_Money_Flow <= 250474 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow > 250474 )
									ret := -0.305556
							if( Negative_Money_Flow_Sum > 2.87068e+06 )
								if( VIM <= 0.633491 )
									ret := -0.428571
								if( VIM > 0.633491 )
									ret := 0.736364 // buy
			if( Typical_Price > 11.7996 )
				if( Negative_Money_Flow_Sum <= 1.28052e+07 )
					if( Typical_Price <= 14.9831 )
						if( VIP_VIM <= 0.106846 )
							if( VIP <= 1.0362 )
								if( Negative_Money_Flow_Sum <= 8.03298e+06 )
									ret := 0.015692
								if( Negative_Money_Flow_Sum > 8.03298e+06 )
									ret := -0.237410
							if( VIP > 1.0362 )
								if( Negative_Money_Flow_Sum <= 8.27144e+06 )
									ret := 0.089901
								if( Negative_Money_Flow_Sum > 8.27144e+06 )
									ret := 0.658537
						if( VIP_VIM > 0.106846 )
							if( MFI <= 74.3652 )
								if( VIM <= 0.721929 )
									ret := 0.313725
								if( VIM > 0.721929 )
									ret := -0.101046
							if( MFI > 74.3652 )
								if( Raw_Money_Flow <= 459293 )
									ret := 0.264798
								if( Raw_Money_Flow > 459293 )
									ret := -0.015345
					if( Typical_Price > 14.9831 )
						if( Raw_Money_Flow <= 1.05478e+06 )
							if( Negative_Money_Flow_Sum <= 2.70211e+06 )
								if( VIP_VIM <= 0.739769 )
									ret := -0.286267
								if( VIP_VIM > 0.739769 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.70211e+06 )
								if( Positive_Money_Flow_Sum <= 3.9168e+06 )
									ret := 0.056818
								if( Positive_Money_Flow_Sum > 3.9168e+06 )
									ret := -0.231293
						if( Raw_Money_Flow > 1.05478e+06 )
							if( Raw_Money_Flow <= 1.62582e+06 )
								if( Positive_Money_Flow_Sum <= 2.07042e+07 )
									ret := 0.217143
								if( Positive_Money_Flow_Sum > 2.07042e+07 )
									ret := 0.941176 // buy
							if( Raw_Money_Flow > 1.62582e+06 )
								if( Positive_Money_Flow_Sum <= 8.93695e+06 )
									ret := -0.574074
								if( Positive_Money_Flow_Sum > 8.93695e+06 )
									ret := 0.029126
				if( Negative_Money_Flow_Sum > 1.28052e+07 )
					if( VIP_VIM <= -0.1781 )
						if( Negative_Money_Flow <= 2.58284e+06 )
							if( Positive_Money_Flow_Sum <= 9.58575e+06 )
								if( Negative_Money_Flow_Sum <= 1.42347e+07 )
									ret := -0.884615 // sell
								if( Negative_Money_Flow_Sum > 1.42347e+07 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 9.58575e+06 )
								if( Negative_Money_Flow_Sum <= 2.1208e+07 )
									ret := 0.282609
								if( Negative_Money_Flow_Sum > 2.1208e+07 )
									ret := -0.687500
						if( Negative_Money_Flow > 2.58284e+06 )
							if( VIP_VIM <= -0.238493 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.238493 )
								ret := 0.750000 // buy
					if( VIP_VIM > -0.1781 )
						if( VIP <= 1.05258 )
							if( Positive_Money_Flow_Sum <= 1.31286e+07 )
								if( Negative_Money_Flow_Sum <= 1.35206e+07 )
									ret := -0.950000 // sell
								if( Negative_Money_Flow_Sum > 1.35206e+07 )
									ret := -0.187500
							if( Positive_Money_Flow_Sum > 1.31286e+07 )
								if( Raw_Money_Flow <= 4.09996e+06 )
									ret := -0.961039 // sell
								if( Raw_Money_Flow > 4.09996e+06 )
									ret := -0.250000
						if( VIP > 1.05258 )
							if( Positive_Money_Flow_Sum <= 1.48817e+07 )
								if( VIP <= 1.06656 )
									ret := 0.500000
								if( VIP > 1.06656 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.48817e+07 )
								if( Money_Flow_Ratio <= 1.29063 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.29063 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_2b3957c8(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


