//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: UNIUSDT_5Min_2MS0_01d16e3d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_5Min_2MS0_01d16e3d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_5Min_01d16e3d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 49.7259 )
		if( rsi1 <= 44.8814 )
			if( MFI <= 35.7779 )
				if( rsi1 <= 32.5538 )
					if( rsi1 <= 24.9995 )
						if( Typical_Price <= 6.28417 )
							if( Money_Flow_Ratio <= 0.154381 )
								if( Negative_Money_Flow_Sum <= 1.53213e+06 )
									ret := -0.190871
								if( Negative_Money_Flow_Sum > 1.53213e+06 )
									ret := 0.416667
							if( Money_Flow_Ratio > 0.154381 )
								if( Raw_Money_Flow <= 4226.26 )
									ret := -0.182390
								if( Raw_Money_Flow > 4226.26 )
									ret := -0.593694
						if( Typical_Price > 6.28417 )
							if( Money_Flow_Ratio <= 0.04633 )
								if( rsi1 <= 15.0267 )
									ret := -0.753846 // sell
								if( rsi1 > 15.0267 )
									ret := 0.265306
							if( Money_Flow_Ratio > 0.04633 )
								if( Money_Flow_Ratio <= 0.550716 )
									ret := -0.762075 // sell
								if( Money_Flow_Ratio > 0.550716 )
									ret := 0.230769
					if( rsi1 > 24.9995 )
						if( MFI <= 15.5029 )
							if( smoothK_k <= 21.5842 )
								if( d_k <= -6.91519 )
									ret := 0.270531
								if( d_k > -6.91519 )
									ret := -0.166118
							if( smoothK_k > 21.5842 )
								if( Negative_Money_Flow <= 58033.6 )
									ret := -0.014451
								if( Negative_Money_Flow > 58033.6 )
									ret := 0.657825
						if( MFI > 15.5029 )
							if( Money_Flow_Ratio <= 0.27941 )
								if( d_k <= -6.61937 )
									ret := 0.257212
								if( d_k > -6.61937 )
									ret := -0.441369
							if( Money_Flow_Ratio > 0.27941 )
								if( d_k <= -4.42628 )
									ret := -0.142163
								if( d_k > -4.42628 )
									ret := -0.571225
				if( rsi1 > 32.5538 )
					if( smoothK_k <= 14.0284 )
						if( rsi1 <= 38.293 )
							if( MFI_Low <= 11.8274 )
								if( Positive_Money_Flow_Sum <= 1.20985e+06 )
									ret := -0.218943
								if( Positive_Money_Flow_Sum > 1.20985e+06 )
									ret := 0.280702
							if( MFI_Low > 11.8274 )
								if( d_k <= -5.29932 )
									ret := 0.175000
								if( d_k > -5.29932 )
									ret := -0.486799
						if( rsi1 > 38.293 )
							if( Positive_Money_Flow_Sum <= 815326 )
								if( MFI_Low <= 0.721419 )
									ret := 0.163842
								if( MFI_Low > 0.721419 )
									ret := -0.090234
							if( Positive_Money_Flow_Sum > 815326 )
								if( rsi1 <= 39.1899 )
									ret := 0.076923
								if( rsi1 > 39.1899 )
									ret := 0.704225 // buy
					if( smoothK_k > 14.0284 )
						if( Negative_Money_Flow <= 79553.7 )
							if( d <= 41.8021 )
								if( d_k <= -4.85743 )
									ret := 0.329227
								if( d_k > -4.85743 )
									ret := -0.273550
							if( d > 41.8021 )
								if( d_k <= -2.25444 )
									ret := -0.012579
								if( d_k > -2.25444 )
									ret := -0.527551
						if( Negative_Money_Flow > 79553.7 )
							if( smoothD_d <= 31.6556 )
								if( MFI_High <= -64.4457 )
									ret := 0.817204 // buy
								if( MFI_High > -64.4457 )
									ret := 0.491979
							if( smoothD_d > 31.6556 )
								if( k <= 42.5697 )
									ret := -0.225664
								if( k > 42.5697 )
									ret := 0.293160
			if( MFI > 35.7779 )
				if( rsi1 <= 36.4075 )
					if( d_k <= 0.689298 )
						if( smoothK_k <= 2.67136 )
							if( Positive_Money_Flow_Sum <= 305003 )
								if( Negative_Money_Flow_Sum <= 121049 )
									ret := -0.224490
								if( Negative_Money_Flow_Sum > 121049 )
									ret := -0.422764
							if( Positive_Money_Flow_Sum > 305003 )
								if( d_k <= 0.073514 )
									ret := -0.532637
								if( d_k > 0.073514 )
									ret := -0.803653 // sell
						if( smoothK_k > 2.67136 )
							if( Negative_Money_Flow_Sum <= 139477 )
								if( Typical_Price <= 5.12638 )
									ret := 0.035928
								if( Typical_Price > 5.12638 )
									ret := -0.224390
							if( Negative_Money_Flow_Sum > 139477 )
								if( Positive_Money_Flow <= 39999.7 )
									ret := -0.363827
								if( Positive_Money_Flow > 39999.7 )
									ret := -0.632385
					if( d_k > 0.689298 )
						if( Negative_Money_Flow_Sum <= 86458.6 )
							if( MFI_Low <= 37.6309 )
								if( MFI <= 54.7688 )
									ret := -0.380282
								if( MFI > 54.7688 )
									ret := -0.145161
							if( MFI_Low > 37.6309 )
								if( smoothD_d <= 17.6791 )
									ret := -0.603175
								if( smoothD_d > 17.6791 )
									ret := -0.831373 // sell
						if( Negative_Money_Flow_Sum > 86458.6 )
							if( Positive_Money_Flow_Sum <= 169284 )
								if( smoothD_d <= 4.02111 )
									ret := -0.605505
								if( smoothD_d > 4.02111 )
									ret := -0.712940 // sell
							if( Positive_Money_Flow_Sum > 169284 )
								if( d_k <= 5.12212 )
									ret := -0.752475 // sell
								if( d_k > 5.12212 )
									ret := -0.845593 // sell
				if( rsi1 > 36.4075 )
					if( d_k <= 0.012286 )
						if( d_k <= -4.47248 )
							if( d <= 12.5393 )
								if( Typical_Price <= 11.4201 )
									ret := 0.053360
								if( Typical_Price > 11.4201 )
									ret := -0.295455
							if( d > 12.5393 )
								if( d <= 37.3022 )
									ret := 0.341528
								if( d > 37.3022 )
									ret := 0.050955
						if( d_k > -4.47248 )
							if( k <= 42.9698 )
								if( Positive_Money_Flow <= 42723 )
									ret := -0.045726
								if( Positive_Money_Flow > 42723 )
									ret := -0.355828
							if( k > 42.9698 )
								if( rsi1 <= 42.9199 )
									ret := -0.560748
								if( rsi1 > 42.9199 )
									ret := -0.024390
					if( d_k > 0.012286 )
						if( Typical_Price <= 4.79293 )
							if( MFI_Low <= 29.0304 )
								if( smoothK_k <= 46.3445 )
									ret := -0.128668
								if( smoothK_k > 46.3445 )
									ret := -0.600000
							if( MFI_Low > 29.0304 )
								if( smoothD_d <= 3.88327 )
									ret := -0.093333
								if( smoothD_d > 3.88327 )
									ret := -0.421277
						if( Typical_Price > 4.79293 )
							if( Positive_Money_Flow_Sum <= 166303 )
								if( d_k <= 7.51726 )
									ret := -0.394220
								if( d_k > 7.51726 )
									ret := -0.612769
							if( Positive_Money_Flow_Sum > 166303 )
								if( d <= 31.2041 )
									ret := -0.637229
								if( d > 31.2041 )
									ret := -0.774887 // sell
		if( rsi1 > 44.8814 )
			if( d <= 48.1288 )
				if( smoothK_k <= 28.7614 )
					if( smoothD_d <= 27.6818 )
						if( k <= 17.3717 )
							if( d <= 15.8114 )
								if( smoothK_k <= 5.58651 )
									ret := -0.232540
								if( smoothK_k > 5.58651 )
									ret := 0.151872
							if( d > 15.8114 )
								if( Positive_Money_Flow <= 18697.1 )
									ret := -0.293494
								if( Positive_Money_Flow > 18697.1 )
									ret := -0.531657
						if( k > 17.3717 )
							if( d_k <= -1.61581 )
								if( Negative_Money_Flow_Sum <= 130637 )
									ret := 0.128276
								if( Negative_Money_Flow_Sum > 130637 )
									ret := 0.507199
							if( d_k > -1.61581 )
								if( rsi1 <= 55.3829 )
									ret := -0.125296
								if( rsi1 > 55.3829 )
									ret := 0.380223
					if( smoothD_d > 27.6818 )
						if( d_k <= 12.1279 )
							if( Raw_Money_Flow <= 31078.2 )
								if( Positive_Money_Flow <= 9.79392 )
									ret := 0.086835
								if( Positive_Money_Flow > 9.79392 )
									ret := -0.196203
							if( Raw_Money_Flow > 31078.2 )
								if( d_k <= 4.28938 )
									ret := 0.144654
								if( d_k > 4.28938 )
									ret := -0.380466
						if( d_k > 12.1279 )
							if( Raw_Money_Flow <= 19659.9 )
								if( MFI_Low <= 51.3403 )
									ret := -0.187368
								if( MFI_Low > 51.3403 )
									ret := -0.538922
							if( Raw_Money_Flow > 19659.9 )
								if( Positive_Money_Flow_Sum <= 2.22213e+07 )
									ret := -0.649558
								if( Positive_Money_Flow_Sum > 2.22213e+07 )
									ret := 0.285714
				if( smoothK_k > 28.7614 )
					if( d_k <= 1.22656 )
						if( Positive_Money_Flow <= 387.954 )
							if( Raw_Money_Flow <= 24433.7 )
								if( rsi1 <= 54.8378 )
									ret := 0.383199
								if( rsi1 > 54.8378 )
									ret := 0.607029
							if( Raw_Money_Flow > 24433.7 )
								if( Raw_Money_Flow <= 39313 )
									ret := 0.629683
								if( Raw_Money_Flow > 39313 )
									ret := 0.759098 // buy
						if( Positive_Money_Flow > 387.954 )
							if( Negative_Money_Flow <= 2.01819 )
								if( Negative_Money_Flow_Sum <= 246012 )
									ret := 0.271513
								if( Negative_Money_Flow_Sum > 246012 )
									ret := 0.497148
							if( Negative_Money_Flow > 2.01819 )
								if( d <= 35.6545 )
									ret := 0.968504 // buy
								if( d > 35.6545 )
									ret := 0.578125
					if( d_k > 1.22656 )
						if( Negative_Money_Flow <= 3860.88 )
							if( MFI_Low <= 58.3819 )
								if( k <= 36.0912 )
									ret := -0.475375
								if( k > 36.0912 )
									ret := -0.227273
							if( MFI_Low > 58.3819 )
								if( d_k <= 7.47909 )
									ret := 0.489362
								if( d_k > 7.47909 )
									ret := -0.269841
						if( Negative_Money_Flow > 3860.88 )
							if( smoothD_d <= 35.4003 )
								if( rsi1 <= 47.3952 )
									ret := -0.043478
								if( rsi1 > 47.3952 )
									ret := 0.539823
							if( smoothD_d > 35.4003 )
								if( k <= 34.5031 )
									ret := -0.177778
								if( k > 34.5031 )
									ret := 0.110305
			if( d > 48.1288 )
				if( rsi1 <= 61.8935 )
					if( Money_Flow_Ratio <= 2.37688 )
						if( Raw_Money_Flow <= 48294.9 )
							if( d_k <= 5.80184 )
								if( rsi1 <= 54.7241 )
									ret := -0.097179
								if( rsi1 > 54.7241 )
									ret := 0.372263
							if( d_k > 5.80184 )
								if( smoothK_k <= 47.443 )
									ret := -0.383851
								if( smoothK_k > 47.443 )
									ret := -0.525180
						if( Raw_Money_Flow > 48294.9 )
							if( Negative_Money_Flow <= 4994.04 )
								if( d <= 49.1828 )
									ret := -0.305085
								if( d > 49.1828 )
									ret := -0.757866 // sell
							if( Negative_Money_Flow > 4994.04 )
								if( rsi1 <= 54.8688 )
									ret := -0.552316
								if( rsi1 > 54.8688 )
									ret := 0.004484
					if( Money_Flow_Ratio > 2.37688 )
						if( Positive_Money_Flow <= 10179.1 )
							if( Positive_Money_Flow_Sum <= 167362 )
								if( Typical_Price <= 4.94151 )
									ret := 0.185185
								if( Typical_Price > 4.94151 )
									ret := -0.307692
							if( Positive_Money_Flow_Sum > 167362 )
								if( d_k <= 11.0136 )
									ret := -0.177305
								if( d_k > 11.0136 )
									ret := -0.672657
						if( Positive_Money_Flow > 10179.1 )
							if( Raw_Money_Flow <= 32548.4 )
								if( d_k <= 13.8054 )
									ret := -0.414634
								if( d_k > 13.8054 )
									ret := -0.823529 // sell
							if( Raw_Money_Flow > 32548.4 )
								if( d_k <= 4.12749 )
									ret := 0.200000
								if( d_k > 4.12749 )
									ret := -0.882407 // sell
				if( rsi1 > 61.8935 )
					if( Money_Flow_Ratio <= 4.33379 )
						if( d_k <= 7.47706 )
							if( d_k <= 2.02075 )
								if( MFI_High <= 0.332183 )
									ret := 0.650000
								if( MFI_High > 0.332183 )
									ret := 1.000000 // buy
							if( d_k > 2.02075 )
								if( MFI_High <= -10.4328 )
									ret := 0.064220
								if( MFI_High > -10.4328 )
									ret := 0.596639
						if( d_k > 7.47706 )
							if( rsi1 <= 72.0669 )
								if( Positive_Money_Flow_Sum <= 283598 )
									ret := 0.160920
								if( Positive_Money_Flow_Sum > 283598 )
									ret := -0.250535
							if( rsi1 > 72.0669 )
								if( Negative_Money_Flow <= 223924 )
									ret := 0.263158
								if( Negative_Money_Flow > 223924 )
									ret := 1.000000 // buy
					if( Money_Flow_Ratio > 4.33379 )
						if( d_k <= 7.95384 )
							if( Negative_Money_Flow_Sum <= 186451 )
								if( smoothD_d <= 50.0647 )
									ret := 0.852941 // buy
								if( smoothD_d > 50.0647 )
									ret := 0.470588
							if( Negative_Money_Flow_Sum > 186451 )
								if( rsi1 <= 71.3778 )
									ret := -0.454545
								if( rsi1 > 71.3778 )
									ret := 0.846154 // buy
						if( d_k > 7.95384 )
							if( rsi1 <= 72.7777 )
								if( Positive_Money_Flow_Sum <= 543541 )
									ret := -0.404255
								if( Positive_Money_Flow_Sum > 543541 )
									ret := -0.760465 // sell
							if( rsi1 > 72.7777 )
								if( Raw_Money_Flow <= 71402.6 )
									ret := 0.187500
								if( Raw_Money_Flow > 71402.6 )
									ret := -0.369565
	if( smoothK_k > 49.7259 )
		if( smoothK_k <= 77.9788 )
			if( d_k <= 0.097602 )
				if( smoothD_d <= 46.5529 )
					if( Negative_Money_Flow_Sum <= 85442.5 )
						if( Negative_Money_Flow_Sum <= 38208.4 )
							if( MFI <= 84.4981 )
								if( MFI_High <= -4.11641 )
									ret := 0.026087
								if( MFI_High > -4.11641 )
									ret := -0.214286
							if( MFI > 84.4981 )
								ret := 0.333333
						if( Negative_Money_Flow_Sum > 38208.4 )
							if( Negative_Money_Flow_Sum <= 47830 )
								if( rsi1 <= 60.1972 )
									ret := 0.142857
								if( rsi1 > 60.1972 )
									ret := 0.862745 // buy
							if( Negative_Money_Flow_Sum > 47830 )
								if( Raw_Money_Flow <= 17128.1 )
									ret := 0.272727
								if( Raw_Money_Flow > 17128.1 )
									ret := -0.100000
					if( Negative_Money_Flow_Sum > 85442.5 )
						if( d_k <= -11.9568 )
							if( rsi1 <= 42.5403 )
								if( MFI_Low <= -5.61329 )
									ret := 0.732143 // buy
								if( MFI_Low > -5.61329 )
									ret := 0.396250
							if( rsi1 > 42.5403 )
								if( Money_Flow_Ratio <= 0.342106 )
									ret := 0.832595 // buy
								if( Money_Flow_Ratio > 0.342106 )
									ret := 0.701536 // buy
						if( d_k > -11.9568 )
							if( Money_Flow_Ratio <= 0.685725 )
								if( smoothK_k <= 49.8219 )
									ret := -0.642857
								if( smoothK_k > 49.8219 )
									ret := 0.237931
							if( Money_Flow_Ratio > 0.685725 )
								if( rsi1 <= 41.9274 )
									ret := -0.282051
								if( rsi1 > 41.9274 )
									ret := 0.671378
				if( smoothD_d > 46.5529 )
					if( Negative_Money_Flow <= 12569.1 )
						if( d_k <= -5.15178 )
							if( Typical_Price <= 4.94229 )
								if( smoothD_d <= 53.0632 )
									ret := 0.292308
								if( smoothD_d > 53.0632 )
									ret := 0.097872
							if( Typical_Price > 4.94229 )
								if( MFI_Low <= 3.04551 )
									ret := 0.215227
								if( MFI_Low > 3.04551 )
									ret := 0.528839
						if( d_k > -5.15178 )
							if( Negative_Money_Flow_Sum <= 543427 )
								if( Positive_Money_Flow_Sum <= 385632 )
									ret := 0.119555
								if( Positive_Money_Flow_Sum > 385632 )
									ret := 0.553343
							if( Negative_Money_Flow_Sum > 543427 )
								if( MFI_High <= -31.9704 )
									ret := -0.223011
								if( MFI_High > -31.9704 )
									ret := 0.370892
					if( Negative_Money_Flow > 12569.1 )
						if( rsi1 <= 45.7299 )
							if( Negative_Money_Flow <= 126983 )
								if( d_k <= -8.49507 )
									ret := 0.423573
								if( d_k > -8.49507 )
									ret := -0.217391
							if( Negative_Money_Flow > 126983 )
								if( Positive_Money_Flow_Sum <= 3.54996e+06 )
									ret := 0.490694
								if( Positive_Money_Flow_Sum > 3.54996e+06 )
									ret := -0.246575
						if( rsi1 > 45.7299 )
							if( MFI <= 27.7098 )
								if( d <= 68.6144 )
									ret := 0.875332 // buy
								if( d > 68.6144 )
									ret := 0.600000
							if( MFI > 27.7098 )
								if( MFI_Low <= 27.998 )
									ret := 0.630921
								if( MFI_Low > 27.998 )
									ret := 0.734520 // buy
			if( d_k > 0.097602 )
				if( Negative_Money_Flow <= 750.312 )
					if( MFI_Low <= 40.6086 )
						if( Negative_Money_Flow_Sum <= 162124 )
							if( rsi1 <= 56.7131 )
								if( Positive_Money_Flow_Sum <= 55393 )
									ret := -0.160804
								if( Positive_Money_Flow_Sum > 55393 )
									ret := -0.459716
							if( rsi1 > 56.7131 )
								if( MFI <= 42.0252 )
									ret := 0.500000
								if( MFI > 42.0252 )
									ret := 0.023810
						if( Negative_Money_Flow_Sum > 162124 )
							if( Typical_Price <= 11.4197 )
								if( Positive_Money_Flow <= 103218 )
									ret := -0.540834
								if( Positive_Money_Flow > 103218 )
									ret := -0.705495 // sell
							if( Typical_Price > 11.4197 )
								if( MFI <= 41.3302 )
									ret := -0.663866
								if( MFI > 41.3302 )
									ret := -0.280597
					if( MFI_Low > 40.6086 )
						if( rsi1 <= 69.2034 )
							if( Typical_Price <= 4.397 )
								if( MFI_Low <= 43.5336 )
									ret := 0.518519
								if( MFI_Low > 43.5336 )
									ret := -0.142241
							if( Typical_Price > 4.397 )
								if( Raw_Money_Flow <= 50997.3 )
									ret := -0.382439
								if( Raw_Money_Flow > 50997.3 )
									ret := -0.622428
						if( rsi1 > 69.2034 )
							if( rsi1 <= 79.6547 )
								if( MFI_High <= 2.40212 )
									ret := 0.262121
								if( MFI_High > 2.40212 )
									ret := -0.247340
							if( rsi1 > 79.6547 )
								if( Negative_Money_Flow_Sum <= 40191.1 )
									ret := -0.384615
								if( Negative_Money_Flow_Sum > 40191.1 )
									ret := 0.609562
				if( Negative_Money_Flow > 750.312 )
					if( MFI_Low <= 35.4199 )
						if( Typical_Price <= 6.26004 )
							if( Negative_Money_Flow_Sum <= 295098 )
								if( rsi1 <= 46.6297 )
									ret := -0.237113
								if( rsi1 > 46.6297 )
									ret := 0.096647
							if( Negative_Money_Flow_Sum > 295098 )
								if( Negative_Money_Flow <= 303509 )
									ret := -0.360206
								if( Negative_Money_Flow > 303509 )
									ret := 0.655172
						if( Typical_Price > 6.26004 )
							if( Raw_Money_Flow <= 1.56767e+06 )
								if( k <= 70.1189 )
									ret := -0.449227
								if( k > 70.1189 )
									ret := -0.272206
							if( Raw_Money_Flow > 1.56767e+06 )
								ret := 0.818182 // buy
					if( MFI_Low > 35.4199 )
						if( smoothK_k <= 56.6501 )
							if( Raw_Money_Flow <= 2.15504e+06 )
								if( Raw_Money_Flow <= 542178 )
									ret := -0.187553
								if( Raw_Money_Flow > 542178 )
									ret := -0.896552 // sell
							if( Raw_Money_Flow > 2.15504e+06 )
								ret := 0.647059
						if( smoothK_k > 56.6501 )
							if( MFI_High <= -4.43045 )
								if( d <= 71.1293 )
									ret := 0.256410
								if( d > 71.1293 )
									ret := -0.105473
							if( MFI_High > -4.43045 )
								if( rsi1 <= 71.5481 )
									ret := -0.056787
								if( rsi1 > 71.5481 )
									ret := 0.571429
		if( smoothK_k > 77.9788 )
			if( d <= 84.0152 )
				if( rsi1 <= 59.1584 )
					if( Negative_Money_Flow_Sum <= 127407 )
						if( MFI <= 87.4444 )
							if( Money_Flow_Ratio <= 1.2998 )
								if( Negative_Money_Flow <= 3291.05 )
									ret := 0.089372
								if( Negative_Money_Flow > 3291.05 )
									ret := 0.450000
							if( Money_Flow_Ratio > 1.2998 )
								if( smoothD_d <= 73.2447 )
									ret := -0.117647
								if( smoothD_d > 73.2447 )
									ret := 0.093458
						if( MFI > 87.4444 )
							ret := -0.882353 // sell
					if( Negative_Money_Flow_Sum > 127407 )
						if( Raw_Money_Flow <= 31504.6 )
							if( rsi1 <= 44.4448 )
								if( d_k <= -7.27707 )
									ret := 0.217791
								if( d_k > -7.27707 )
									ret := -0.472727
							if( rsi1 > 44.4448 )
								if( d <= 76.627 )
									ret := 0.586168
								if( d > 76.627 )
									ret := 0.316576
						if( Raw_Money_Flow > 31504.6 )
							if( smoothD_d <= 75.997 )
								if( MFI_High <= -39.8174 )
									ret := 0.751512 // buy
								if( MFI_High > -39.8174 )
									ret := 0.493724
							if( smoothD_d > 75.997 )
								if( smoothK_k <= 83.1057 )
									ret := 0.015789
								if( smoothK_k > 83.1057 )
									ret := 0.572944
				if( rsi1 > 59.1584 )
					if( Negative_Money_Flow_Sum <= 90452.2 )
						if( MFI <= 73.8547 )
							if( Positive_Money_Flow_Sum <= 74198.4 )
								if( Raw_Money_Flow <= 29594.8 )
									ret := 0.215686
								if( Raw_Money_Flow > 29594.8 )
									ret := 0.894737 // buy
							if( Positive_Money_Flow_Sum > 74198.4 )
								if( Typical_Price <= 4.584 )
									ret := 0.223684
								if( Typical_Price > 4.584 )
									ret := 0.668555
						if( MFI > 73.8547 )
							if( Positive_Money_Flow_Sum <= 215750 )
								if( Money_Flow_Ratio <= 10.013 )
									ret := 0.043478
								if( Money_Flow_Ratio > 10.013 )
									ret := -0.538462
							if( Positive_Money_Flow_Sum > 215750 )
								if( rsi1 <= 74.0966 )
									ret := 0.110169
								if( rsi1 > 74.0966 )
									ret := 0.811966 // buy
					if( Negative_Money_Flow_Sum > 90452.2 )
						if( Typical_Price <= 4.31783 )
							if( MFI <= 46.1578 )
								if( d_k <= -8.63912 )
									ret := 0.394737
								if( d_k > -8.63912 )
									ret := 0.833333 // buy
							if( MFI > 46.1578 )
								if( Positive_Money_Flow <= 49414.7 )
									ret := 0.069767
								if( Positive_Money_Flow > 49414.7 )
									ret := 0.714286 // buy
						if( Typical_Price > 4.31783 )
							if( rsi1 <= 65.9099 )
								if( Money_Flow_Ratio <= 2.2609 )
									ret := 0.739406 // buy
								if( Money_Flow_Ratio > 2.2609 )
									ret := 0.351145
							if( rsi1 > 65.9099 )
								if( smoothK_k <= 96.9978 )
									ret := 0.839383 // buy
								if( smoothK_k > 96.9978 )
									ret := 0.600000
			if( d > 84.0152 )
				if( d_k <= 0.950033 )
					if( Positive_Money_Flow_Sum <= 201005 )
						if( smoothK_k <= 88.4836 )
							if( rsi1 <= 60.5638 )
								if( Positive_Money_Flow_Sum <= 190511 )
									ret := 0.008811
								if( Positive_Money_Flow_Sum > 190511 )
									ret := -0.724138 // sell
							if( rsi1 > 60.5638 )
								if( Raw_Money_Flow <= 5291.16 )
									ret := 0.094828
								if( Raw_Money_Flow > 5291.16 )
									ret := 0.405405
						if( smoothK_k > 88.4836 )
							if( Negative_Money_Flow_Sum <= 48637.9 )
								if( rsi1 <= 68.8707 )
									ret := 0.032020
								if( rsi1 > 68.8707 )
									ret := 0.267009
							if( Negative_Money_Flow_Sum > 48637.9 )
								if( rsi1 <= 59.4179 )
									ret := 0.208169
								if( rsi1 > 59.4179 )
									ret := 0.503197
					if( Positive_Money_Flow_Sum > 201005 )
						if( smoothK_k <= 93.9574 )
							if( MFI <= 59.8188 )
								if( rsi1 <= 55.0721 )
									ret := 0.184851
								if( rsi1 > 55.0721 )
									ret := 0.624186
							if( MFI > 59.8188 )
								if( Positive_Money_Flow_Sum <= 761980 )
									ret := 0.548456
								if( Positive_Money_Flow_Sum > 761980 )
									ret := 0.741429 // buy
						if( smoothK_k > 93.9574 )
							if( k <= 99.9995 )
								if( k <= 99.7451 )
									ret := 0.693584
								if( k > 99.7451 )
									ret := 0.884191 // buy
							if( k > 99.9995 )
								if( Positive_Money_Flow_Sum <= 488949 )
									ret := 0.473439
								if( Positive_Money_Flow_Sum > 488949 )
									ret := 0.687003
				if( d_k > 0.950033 )
					if( smoothK_k <= 86.1461 )
						if( d_k <= 3.20868 )
							if( Raw_Money_Flow <= 88864.1 )
								if( Raw_Money_Flow <= 77188.4 )
									ret := 0.048423
								if( Raw_Money_Flow > 77188.4 )
									ret := -0.533333
							if( Raw_Money_Flow > 88864.1 )
								if( Money_Flow_Ratio <= 1.51677 )
									ret := -0.023952
								if( Money_Flow_Ratio > 1.51677 )
									ret := 0.628205
						if( d_k > 3.20868 )
							if( rsi1 <= 77.4007 )
								if( rsi1 <= 49.3406 )
									ret := -0.442623
								if( rsi1 > 49.3406 )
									ret := -0.078613
							if( rsi1 > 77.4007 )
								if( Positive_Money_Flow <= 236870 )
									ret := 0.347656
								if( Positive_Money_Flow > 236870 )
									ret := 0.818182 // buy
					if( smoothK_k > 86.1461 )
						if( MFI <= 56.9363 )
							if( smoothK_k <= 89.1265 )
								if( MFI <= 47.901 )
									ret := -0.055914
								if( MFI > 47.901 )
									ret := 0.116788
							if( smoothK_k > 89.1265 )
								if( Positive_Money_Flow_Sum <= 312080 )
									ret := 0.082492
								if( Positive_Money_Flow_Sum > 312080 )
									ret := 0.345808
						if( MFI > 56.9363 )
							if( rsi1 <= 73.9132 )
								if( rsi1 <= 68.1084 )
									ret := 0.133841
								if( rsi1 > 68.1084 )
									ret := 0.311278
							if( rsi1 > 73.9132 )
								if( Typical_Price <= 8.05901 )
									ret := 0.435500
								if( Typical_Price > 8.05901 )
									ret := 0.716080 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_UNIUSDT_5Min_01d16e3d(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


