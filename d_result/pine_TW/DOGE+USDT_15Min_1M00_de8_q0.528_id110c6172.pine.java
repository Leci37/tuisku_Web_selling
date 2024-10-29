//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: DOGEUSDT_15Min_1M00_110c6172 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_1M00_110c6172", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_110c6172(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 377289 )
		if( Raw_Money_Flow <= 1.60019e+06 )
			if( Money_Flow_Ratio <= 1.55706 )
				if( Positive_Money_Flow <= 1.57811e+06 )
					if( Negative_Money_Flow <= 217026 )
						if( Negative_Money_Flow_Sum <= 2.17959e+07 )
							if( Typical_Price <= 0.106443 )
								if( Money_Flow_Ratio <= 0.728703 )
									ret := 0.001627
								if( Money_Flow_Ratio > 0.728703 )
									ret := 0.043853
							if( Typical_Price > 0.106443 )
								if( MFI_Low <= 40.5461 )
									ret := -0.088343
								if( MFI_Low > 40.5461 )
									ret := 0.526316
						if( Negative_Money_Flow_Sum > 2.17959e+07 )
							if( MFI_Low <= -8.47122 )
								if( Typical_Price <= 0.085155 )
									ret := -0.625000
								if( Typical_Price > 0.085155 )
									ret := -0.062500
							if( MFI_Low > -8.47122 )
								if( Positive_Money_Flow <= 1.51907e+06 )
									ret := 0.275168
								if( Positive_Money_Flow > 1.51907e+06 )
									ret := -0.208333
					if( Negative_Money_Flow > 217026 )
						if( Negative_Money_Flow <= 245156 )
							if( Money_Flow_Ratio <= 0.620432 )
								if( MFI_High <= -42.5333 )
									ret := 0.000000
								if( MFI_High > -42.5333 )
									ret := 0.365854
							if( Money_Flow_Ratio > 0.620432 )
								if( Positive_Money_Flow_Sum <= 3.50761e+06 )
									ret := -0.123077
								if( Positive_Money_Flow_Sum > 3.50761e+06 )
									ret := -0.388889
						if( Negative_Money_Flow > 245156 )
							if( Positive_Money_Flow_Sum <= 3.04212e+06 )
								if( MFI <= 30.4698 )
									ret := -0.105954
								if( MFI > 30.4698 )
									ret := 0.074195
							if( Positive_Money_Flow_Sum > 3.04212e+06 )
								if( Money_Flow_Ratio <= 0.455453 )
									ret := 0.106796
								if( Money_Flow_Ratio > 0.455453 )
									ret := -0.112981
				if( Positive_Money_Flow > 1.57811e+06 )
					if( Typical_Price <= 0.081106 )
						if( Money_Flow_Ratio <= 1.15725 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 1.15725 )
							ret := 0.666667
					if( Typical_Price > 0.081106 )
						if( Positive_Money_Flow_Sum <= 1.82371e+07 )
							if( Positive_Money_Flow <= 1.58413e+06 )
								if( Typical_Price <= 0.0917 )
									ret := 0.375000
								if( Typical_Price > 0.0917 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow > 1.58413e+06 )
								if( Negative_Money_Flow_Sum <= 2.41981e+07 )
									ret := 0.179487
								if( Negative_Money_Flow_Sum > 2.41981e+07 )
									ret := -0.636364
						if( Positive_Money_Flow_Sum > 1.82371e+07 )
							ret := 0.538462
			if( Money_Flow_Ratio > 1.55706 )
				if( Typical_Price <= 0.089825 )
					if( Negative_Money_Flow_Sum <= 3.02819e+06 )
						if( Positive_Money_Flow_Sum <= 3.54915e+06 )
							if( MFI_High <= -16.6005 )
								if( Raw_Money_Flow <= 343830 )
									ret := -0.121591
								if( Raw_Money_Flow > 343830 )
									ret := 0.175439
							if( MFI_High > -16.6005 )
								if( Raw_Money_Flow <= 1.12212e+06 )
									ret := 0.059954
								if( Raw_Money_Flow > 1.12212e+06 )
									ret := 0.533333
						if( Positive_Money_Flow_Sum > 3.54915e+06 )
							if( Raw_Money_Flow <= 414576 )
								if( Typical_Price <= 0.061082 )
									ret := 0.210526
								if( Typical_Price > 0.061082 )
									ret := -0.045200
							if( Raw_Money_Flow > 414576 )
								if( Typical_Price <= 0.0684 )
									ret := -0.014377
								if( Typical_Price > 0.0684 )
									ret := -0.185668
					if( Negative_Money_Flow_Sum > 3.02819e+06 )
						if( MFI_Low <= 44.205 )
							if( Raw_Money_Flow <= 508843 )
								if( Raw_Money_Flow <= 375731 )
									ret := -0.013216
								if( Raw_Money_Flow > 375731 )
									ret := 0.427083
							if( Raw_Money_Flow > 508843 )
								if( Positive_Money_Flow <= 562407 )
									ret := -0.528302
								if( Positive_Money_Flow > 562407 )
									ret := -0.162353
						if( MFI_Low > 44.205 )
							if( Positive_Money_Flow_Sum <= 2.06085e+07 )
								if( Positive_Money_Flow <= 1.51899e+06 )
									ret := 0.187172
								if( Positive_Money_Flow > 1.51899e+06 )
									ret := -0.513514
							if( Positive_Money_Flow_Sum > 2.06085e+07 )
								if( MFI <= 81.2087 )
									ret := -0.324176
								if( MFI > 81.2087 )
									ret := 0.222222
				if( Typical_Price > 0.089825 )
					if( Positive_Money_Flow_Sum <= 9.578e+06 )
						if( Positive_Money_Flow <= 981924 )
							if( MFI_Low <= 71.0397 )
								if( Raw_Money_Flow <= 203192 )
									ret := -0.260000
								if( Raw_Money_Flow > 203192 )
									ret := 0.011910
							if( MFI_Low > 71.0397 )
								if( Positive_Money_Flow <= 325430 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow > 325430 )
									ret := -0.272727
						if( Positive_Money_Flow > 981924 )
							if( Negative_Money_Flow_Sum <= 4.13999e+06 )
								if( Negative_Money_Flow_Sum <= 2.0088e+06 )
									ret := -0.034483
								if( Negative_Money_Flow_Sum > 2.0088e+06 )
									ret := -0.495726
							if( Negative_Money_Flow_Sum > 4.13999e+06 )
								if( Raw_Money_Flow <= 1.48111e+06 )
									ret := 0.255319
								if( Raw_Money_Flow > 1.48111e+06 )
									ret := -0.400000
					if( Positive_Money_Flow_Sum > 9.578e+06 )
						if( Positive_Money_Flow_Sum <= 1.44077e+07 )
							if( Positive_Money_Flow_Sum <= 1.41695e+07 )
								if( Negative_Money_Flow <= 128038 )
									ret := -0.277143
								if( Negative_Money_Flow > 128038 )
									ret := 0.166667
							if( Positive_Money_Flow_Sum > 1.41695e+07 )
								if( Positive_Money_Flow <= 948086 )
									ret := -0.230769
								if( Positive_Money_Flow > 948086 )
									ret := -0.925926 // sell
						if( Positive_Money_Flow_Sum > 1.44077e+07 )
							if( MFI_Low <= 50.8478 )
								if( MFI_Low <= 49.9837 )
									ret := -0.009852
								if( MFI_Low > 49.9837 )
									ret := 0.393939
							if( MFI_Low > 50.8478 )
								if( Typical_Price <= 0.125276 )
									ret := -0.041667
								if( Typical_Price > 0.125276 )
									ret := -0.512821
		if( Raw_Money_Flow > 1.60019e+06 )
			if( Negative_Money_Flow_Sum <= 2.09142e+07 )
				if( Positive_Money_Flow_Sum <= 6.1791e+07 )
					if( MFI_High <= -36.0453 )
						if( Typical_Price <= 0.133297 )
							if( MFI_High <= -50.8953 )
								if( Money_Flow_Ratio <= 0.237593 )
									ret := 0.818182 // buy
								if( Money_Flow_Ratio > 0.237593 )
									ret := -0.209877
							if( MFI_High > -50.8953 )
								if( Raw_Money_Flow <= 2.36815e+06 )
									ret := 0.195312
								if( Raw_Money_Flow > 2.36815e+06 )
									ret := 0.505263
						if( Typical_Price > 0.133297 )
							if( MFI_High <= -36.3942 )
								if( MFI <= 39.6494 )
									ret := -0.414414
								if( MFI > 39.6494 )
									ret := -0.683333
							if( MFI_High > -36.3942 )
								ret := 0.727273 // buy
					if( MFI_High > -36.0453 )
						if( Typical_Price <= 0.064493 )
							if( Positive_Money_Flow <= 3.31389e+06 )
								if( Positive_Money_Flow_Sum <= 2.30801e+07 )
									ret := -0.734568 // sell
								if( Positive_Money_Flow_Sum > 2.30801e+07 )
									ret := 0.500000
							if( Positive_Money_Flow > 3.31389e+06 )
								if( Positive_Money_Flow_Sum <= 1.15904e+07 )
									ret := -0.718750 // sell
								if( Positive_Money_Flow_Sum > 1.15904e+07 )
									ret := 0.153846
						if( Typical_Price > 0.064493 )
							if( Negative_Money_Flow_Sum <= 8.98115e+06 )
								if( Negative_Money_Flow_Sum <= 8.03228e+06 )
									ret := -0.110664
								if( Negative_Money_Flow_Sum > 8.03228e+06 )
									ret := 0.086134
							if( Negative_Money_Flow_Sum > 8.98115e+06 )
								if( Positive_Money_Flow_Sum <= 5.97137e+07 )
									ret := -0.256009
								if( Positive_Money_Flow_Sum > 5.97137e+07 )
									ret := 0.581395
				if( Positive_Money_Flow_Sum > 6.1791e+07 )
					if( Typical_Price <= 0.201845 )
						if( Positive_Money_Flow <= 2.41957e+07 )
							if( Positive_Money_Flow_Sum <= 6.66381e+07 )
								if( MFI_Low <= 66.0054 )
									ret := -0.181818
								if( MFI_Low > 66.0054 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 6.66381e+07 )
								if( MFI <= 88.147 )
									ret := -0.762887 // sell
								if( MFI > 88.147 )
									ret := -0.987013 // sell
						if( Positive_Money_Flow > 2.41957e+07 )
							if( MFI_Low <= 66.0427 )
								ret := -0.555556
							if( MFI_Low > 66.0427 )
								ret := 0.333333
					if( Typical_Price > 0.201845 )
						ret := 0.375000
			if( Negative_Money_Flow_Sum > 2.09142e+07 )
				if( Money_Flow_Ratio <= 0.251047 )
					if( MFI_Low <= -4.83194 )
						if( Positive_Money_Flow_Sum <= 6.30933e+06 )
							if( MFI <= 9.40508 )
								ret := 0.000000
							if( MFI > 9.40508 )
								ret := -0.470588
						if( Positive_Money_Flow_Sum > 6.30933e+06 )
							if( MFI_High <= -67.068 )
								ret := 0.916667 // buy
							if( MFI_High > -67.068 )
								ret := 0.357143
					if( MFI_Low > -4.83194 )
						if( MFI_High <= -63.2228 )
							if( Typical_Price <= 0.082725 )
								ret := 0.272727
							if( Typical_Price > 0.082725 )
								if( Typical_Price <= 0.150666 )
									ret := -0.772727 // sell
								if( Typical_Price > 0.150666 )
									ret := -0.181818
						if( MFI_High > -63.2228 )
							if( Typical_Price <= 0.076725 )
								ret := 0.769231 // buy
							if( Typical_Price > 0.076725 )
								if( Money_Flow_Ratio <= 0.244964 )
									ret := -0.204819
								if( Money_Flow_Ratio > 0.244964 )
									ret := -0.750000 // sell
				if( Money_Flow_Ratio > 0.251047 )
					if( MFI_Low <= 5.56245 )
						if( Negative_Money_Flow_Sum <= 8.17633e+07 )
							if( Negative_Money_Flow_Sum <= 3.84319e+07 )
								if( Positive_Money_Flow_Sum <= 8.88709e+06 )
									ret := 0.229167
								if( Positive_Money_Flow_Sum > 8.88709e+06 )
									ret := 0.756522 // buy
							if( Negative_Money_Flow_Sum > 3.84319e+07 )
								if( Typical_Price <= 0.108503 )
									ret := -0.240741
								if( Typical_Price > 0.108503 )
									ret := 0.344086
						if( Negative_Money_Flow_Sum > 8.17633e+07 )
							if( MFI <= 21.9796 )
								ret := -0.941176 // sell
							if( MFI > 21.9796 )
								ret := -0.470588
					if( MFI_Low > 5.56245 )
						if( Positive_Money_Flow_Sum <= 1.11396e+07 )
							if( MFI <= 28.5602 )
								if( Raw_Money_Flow <= 1.69879e+06 )
									ret := -0.923077 // sell
								if( Raw_Money_Flow > 1.69879e+06 )
									ret := -0.458824
							if( MFI > 28.5602 )
								if( Raw_Money_Flow <= 1.93726e+06 )
									ret := -0.515152
								if( Raw_Money_Flow > 1.93726e+06 )
									ret := 0.437500
						if( Positive_Money_Flow_Sum > 1.11396e+07 )
							if( Raw_Money_Flow <= 1.75926e+06 )
								if( Positive_Money_Flow_Sum <= 1.89689e+07 )
									ret := 0.084507
								if( Positive_Money_Flow_Sum > 1.89689e+07 )
									ret := 0.619048
							if( Raw_Money_Flow > 1.75926e+06 )
								if( Typical_Price <= 0.155081 )
									ret := 0.061829
								if( Typical_Price > 0.155081 )
									ret := -0.074695
	if( Negative_Money_Flow > 377289 )
		if( MFI_High <= -58.7275 )
			if( MFI_High <= -73.3549 )
				if( Negative_Money_Flow_Sum <= 7.66148e+07 )
					if( Raw_Money_Flow <= 8.50265e+06 )
						if( Money_Flow_Ratio <= 0.070574 )
							if( Typical_Price <= 0.107785 )
								if( Positive_Money_Flow_Sum <= 1.50898e+06 )
									ret := -0.367647
								if( Positive_Money_Flow_Sum > 1.50898e+06 )
									ret := 0.315789
							if( Typical_Price > 0.107785 )
								if( Negative_Money_Flow <= 2.83056e+06 )
									ret := -0.900000 // sell
								if( Negative_Money_Flow > 2.83056e+06 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.070574 )
							ret := -0.894737 // sell
					if( Raw_Money_Flow > 8.50265e+06 )
						if( MFI_Low <= -15.818 )
							ret := 0.700000 // buy
						if( MFI_Low > -15.818 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 7.66148e+07 )
					ret := 1.000000 // buy
			if( MFI_High > -73.3549 )
				if( Money_Flow_Ratio <= 0.123118 )
					if( Negative_Money_Flow_Sum <= 3.92679e+07 )
						if( Raw_Money_Flow <= 2.11707e+06 )
							if( Typical_Price <= 0.078244 )
								if( Typical_Price <= 0.059383 )
									ret := 0.764706 // buy
								if( Typical_Price > 0.059383 )
									ret := -0.044643
							if( Typical_Price > 0.078244 )
								if( MFI_High <= -70.3978 )
									ret := 0.594203
								if( MFI_High > -70.3978 )
									ret := 0.000000
						if( Raw_Money_Flow > 2.11707e+06 )
							if( Raw_Money_Flow <= 2.66886e+06 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.66886e+06 )
								if( Money_Flow_Ratio <= 0.118781 )
									ret := 0.608696
								if( Money_Flow_Ratio > 0.118781 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.92679e+07 )
						if( Negative_Money_Flow_Sum <= 5.30793e+07 )
							if( Positive_Money_Flow_Sum <= 4.86738e+06 )
								if( Positive_Money_Flow_Sum <= 3.90306e+06 )
									ret := -0.636364
								if( Positive_Money_Flow_Sum > 3.90306e+06 )
									ret := -0.964286 // sell
							if( Positive_Money_Flow_Sum > 4.86738e+06 )
								ret := -0.333333
						if( Negative_Money_Flow_Sum > 5.30793e+07 )
							if( Typical_Price <= 0.090363 )
								ret := -0.200000
							if( Typical_Price > 0.090363 )
								if( Positive_Money_Flow_Sum <= 6.75104e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 6.75104e+06 )
									ret := 0.818182 // buy
				if( Money_Flow_Ratio > 0.123118 )
					if( MFI <= 18.9419 )
						if( MFI <= 16.281 )
							if( Typical_Price <= 0.072085 )
								if( Negative_Money_Flow_Sum <= 1.05189e+07 )
									ret := 0.245136
								if( Negative_Money_Flow_Sum > 1.05189e+07 )
									ret := 0.774510 // buy
							if( Typical_Price > 0.072085 )
								if( Money_Flow_Ratio <= 0.190287 )
									ret := 0.043347
								if( Money_Flow_Ratio > 0.190287 )
									ret := 0.455446
						if( MFI > 16.281 )
							if( Negative_Money_Flow <= 591612 )
								if( Negative_Money_Flow <= 557303 )
									ret := -0.064220
								if( Negative_Money_Flow > 557303 )
									ret := -0.911765 // sell
							if( Negative_Money_Flow > 591612 )
								if( Money_Flow_Ratio <= 0.233664 )
									ret := 0.057277
								if( Money_Flow_Ratio > 0.233664 )
									ret := -1.000000 // sell
					if( MFI > 18.9419 )
						if( Typical_Price <= 0.08779 )
							if( MFI <= 21.235 )
								if( MFI <= 19.5307 )
									ret := 0.262712
								if( MFI > 19.5307 )
									ret := 0.078603
							if( MFI > 21.235 )
								ret := 0.937500 // buy
						if( Typical_Price > 0.08779 )
							if( Negative_Money_Flow_Sum <= 1.65672e+07 )
								if( Negative_Money_Flow_Sum <= 7.26518e+06 )
									ret := 0.369048
								if( Negative_Money_Flow_Sum > 7.26518e+06 )
									ret := -0.065116
							if( Negative_Money_Flow_Sum > 1.65672e+07 )
								if( Negative_Money_Flow_Sum <= 4.42168e+07 )
									ret := 0.705179 // buy
								if( Negative_Money_Flow_Sum > 4.42168e+07 )
									ret := 0.149733
		if( MFI_High > -58.7275 )
			if( Positive_Money_Flow_Sum <= 2.49374e+06 )
				if( MFI_Low <= 13.4791 )
					if( Typical_Price <= 0.064068 )
						if( Money_Flow_Ratio <= 0.350092 )
							if( Negative_Money_Flow <= 481046 )
								if( MFI_High <= -56.3668 )
									ret := -0.875000 // sell
								if( MFI_High > -56.3668 )
									ret := -0.529412
							if( Negative_Money_Flow > 481046 )
								if( Raw_Money_Flow <= 540711 )
									ret := 0.785714 // buy
								if( Raw_Money_Flow > 540711 )
									ret := -0.009524
						if( Money_Flow_Ratio > 0.350092 )
							if( Positive_Money_Flow_Sum <= 897777 )
								if( MFI_High <= -51.2274 )
									ret := -0.083333
								if( MFI_High > -51.2274 )
									ret := -0.461538
							if( Positive_Money_Flow_Sum > 897777 )
								if( Raw_Money_Flow <= 420704 )
									ret := -0.411765
								if( Raw_Money_Flow > 420704 )
									ret := 0.485294
					if( Typical_Price > 0.064068 )
						if( Negative_Money_Flow <= 499986 )
							if( Negative_Money_Flow_Sum <= 7.26287e+06 )
								if( Positive_Money_Flow_Sum <= 1.48426e+06 )
									ret := -0.146853
								if( Positive_Money_Flow_Sum > 1.48426e+06 )
									ret := 0.190661
							if( Negative_Money_Flow_Sum > 7.26287e+06 )
								if( Negative_Money_Flow <= 428437 )
									ret := -0.666667
								if( Negative_Money_Flow > 428437 )
									ret := -0.875000 // sell
						if( Negative_Money_Flow > 499986 )
							if( Raw_Money_Flow <= 3.18969e+06 )
								if( MFI_Low <= 7.6067 )
									ret := -0.175066
								if( MFI_Low > 7.6067 )
									ret := -0.429167
							if( Raw_Money_Flow > 3.18969e+06 )
								ret := 0.812500 // buy
				if( MFI_Low > 13.4791 )
					if( Money_Flow_Ratio <= 0.588 )
						if( Money_Flow_Ratio <= 0.564214 )
							if( Negative_Money_Flow <= 797678 )
								if( Positive_Money_Flow_Sum <= 2.3763e+06 )
									ret := 0.045662
								if( Positive_Money_Flow_Sum > 2.3763e+06 )
									ret := -0.777778 // sell
							if( Negative_Money_Flow > 797678 )
								if( Positive_Money_Flow_Sum <= 2.19521e+06 )
									ret := 0.611940
								if( Positive_Money_Flow_Sum > 2.19521e+06 )
									ret := 0.018868
						if( Money_Flow_Ratio > 0.564214 )
							if( Negative_Money_Flow <= 410893 )
								ret := -0.562500
							if( Negative_Money_Flow > 410893 )
								if( MFI <= 36.5769 )
									ret := 0.704918 // buy
								if( MFI > 36.5769 )
									ret := 0.277778
					if( Money_Flow_Ratio > 0.588 )
						if( MFI_High <= -42.3403 )
							if( Typical_Price <= 0.08076 )
								if( Raw_Money_Flow <= 763529 )
									ret := -0.777778 // sell
								if( Raw_Money_Flow > 763529 )
									ret := -0.200000
							if( Typical_Price > 0.08076 )
								ret := -0.071429
						if( MFI_High > -42.3403 )
							if( Negative_Money_Flow <= 522729 )
								if( Typical_Price <= 0.07974 )
									ret := -0.025575
								if( Typical_Price > 0.07974 )
									ret := 0.286585
							if( Negative_Money_Flow > 522729 )
								if( Typical_Price <= 0.103527 )
									ret := -0.106576
								if( Typical_Price > 0.103527 )
									ret := -0.578125
			if( Positive_Money_Flow_Sum > 2.49374e+06 )
				if( MFI <= 31.3861 )
					if( Positive_Money_Flow_Sum <= 8.17021e+06 )
						if( Negative_Money_Flow_Sum <= 1.46321e+07 )
							if( Negative_Money_Flow_Sum <= 1.33779e+07 )
								if( Negative_Money_Flow <= 1.92214e+06 )
									ret := 0.048780
								if( Negative_Money_Flow > 1.92214e+06 )
									ret := 0.289277
							if( Negative_Money_Flow_Sum > 1.33779e+07 )
								if( Typical_Price <= 0.065403 )
									ret := -0.666667
								if( Typical_Price > 0.065403 )
									ret := 0.601010
						if( Negative_Money_Flow_Sum > 1.46321e+07 )
							if( Typical_Price <= 0.119843 )
								if( Negative_Money_Flow_Sum <= 1.84224e+07 )
									ret := -0.074586
								if( Negative_Money_Flow_Sum > 1.84224e+07 )
									ret := 0.277419
							if( Typical_Price > 0.119843 )
								if( Money_Flow_Ratio <= 0.325216 )
									ret := -0.116505
								if( Money_Flow_Ratio > 0.325216 )
									ret := -0.578947
					if( Positive_Money_Flow_Sum > 8.17021e+06 )
						if( Negative_Money_Flow <= 1.51924e+06 )
							if( Money_Flow_Ratio <= 0.332934 )
								if( Positive_Money_Flow <= 120561 )
									ret := 0.500000
								if( Positive_Money_Flow > 120561 )
									ret := -0.529412
							if( Money_Flow_Ratio > 0.332934 )
								if( MFI_High <= -49.5476 )
									ret := 0.735849 // buy
								if( MFI_High > -49.5476 )
									ret := 0.206897
						if( Negative_Money_Flow > 1.51924e+06 )
							if( Negative_Money_Flow <= 1.26901e+07 )
								if( Raw_Money_Flow <= 1.0985e+07 )
									ret := 0.151074
								if( Raw_Money_Flow > 1.0985e+07 )
									ret := -0.540984
							if( Negative_Money_Flow > 1.26901e+07 )
								if( Money_Flow_Ratio <= 0.426231 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.426231 )
									ret := -0.344828
				if( MFI > 31.3861 )
					if( Negative_Money_Flow <= 500758 )
						if( MFI_Low <= 60.612 )
							if( Negative_Money_Flow_Sum <= 1.70532e+06 )
								if( MFI_Low <= 49.7318 )
									ret := -0.550725
								if( MFI_Low > 49.7318 )
									ret := -0.133333
							if( Negative_Money_Flow_Sum > 1.70532e+06 )
								if( Typical_Price <= 0.110518 )
									ret := 0.134262
								if( Typical_Price > 0.110518 )
									ret := -0.055024
						if( MFI_Low > 60.612 )
							if( MFI <= 81.9276 )
								if( MFI <= 81.2228 )
									ret := 1.000000 // buy
								if( MFI > 81.2228 )
									ret := 0.909091 // buy
							if( MFI > 81.9276 )
								if( MFI_High <= 2.58761 )
									ret := -0.210526
								if( MFI_High > 2.58761 )
									ret := 0.480000
					if( Negative_Money_Flow > 500758 )
						if( Positive_Money_Flow_Sum <= 2.91184e+07 )
							if( Money_Flow_Ratio <= 0.459086 )
								if( MFI <= 31.4315 )
									ret := -0.870968 // sell
								if( MFI > 31.4315 )
									ret := -0.333333
							if( Money_Flow_Ratio > 0.459086 )
								if( Negative_Money_Flow <= 5.81553e+06 )
									ret := -0.000089
								if( Negative_Money_Flow > 5.81553e+06 )
									ret := 0.152125
						if( Positive_Money_Flow_Sum > 2.91184e+07 )
							if( Positive_Money_Flow_Sum <= 4.18478e+07 )
								if( Negative_Money_Flow_Sum <= 7.17636e+07 )
									ret := 0.163766
								if( Negative_Money_Flow_Sum > 7.17636e+07 )
									ret := 0.851064 // buy
							if( Positive_Money_Flow_Sum > 4.18478e+07 )
								if( Money_Flow_Ratio <= 2.92414 )
									ret := 0.031627
								if( Money_Flow_Ratio > 2.92414 )
									ret := -0.239478
	
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_110c6172(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


