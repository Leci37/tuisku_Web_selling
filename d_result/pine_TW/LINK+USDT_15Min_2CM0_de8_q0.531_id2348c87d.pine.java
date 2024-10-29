//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: LINKUSDT_15Min_2CM0_2348c87d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2CM0_2348c87d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_2348c87d(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 36.781 )
		if( Raw_Money_Flow <= 2.77271e+06 )
			if( Money_Flow_Ratio <= 0.31589 )
				if( Negative_Money_Flow_Sum <= 1.20826e+07 )
					if( ad <= 113384 )
						if( ad_mf <= -146636 )
							if( MFI_High <= -59.3338 )
								if( MFI <= 14.4261 )
									ret := -0.214286
								if( MFI > 14.4261 )
									ret := 0.784091 // buy
							if( MFI_High > -59.3338 )
								if( MFI_High <= -57.097 )
									ret := -0.583333
								if( MFI_High > -57.097 )
									ret := 0.000000
						if( ad_mf > -146636 )
							if( Raw_Money_Flow <= 105630 )
								if( Raw_Money_Flow <= 85770.1 )
									ret := -0.014706
								if( Raw_Money_Flow > 85770.1 )
									ret := -0.230769
							if( Raw_Money_Flow > 105630 )
								if( Raw_Money_Flow <= 2.10857e+06 )
									ret := 0.080834
								if( Raw_Money_Flow > 2.10857e+06 )
									ret := -0.343434
					if( ad > 113384 )
						if( ad <= 153607 )
							if( ad_mf <= 128840 )
								if( Positive_Money_Flow_Sum <= 1.60279e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.60279e+06 )
									ret := -0.900000 // sell
							if( ad_mf > 128840 )
								if( MFI <= 19.4378 )
									ret := -1.000000 // sell
								if( MFI > 19.4378 )
									ret := -0.750000 // sell
						if( ad > 153607 )
							if( Positive_Money_Flow_Sum <= 1.67416e+06 )
								ret := -0.529412
							if( Positive_Money_Flow_Sum > 1.67416e+06 )
								ret := 0.700000 // buy
				if( Negative_Money_Flow_Sum > 1.20826e+07 )
					if( Negative_Money_Flow <= 929367 )
						if( ad <= -67303.6 )
							if( ad_mf <= -146887 )
								ret := -0.733333 // sell
							if( ad_mf > -146887 )
								if( Positive_Money_Flow <= 1.68716e+06 )
									ret := 0.838710 // buy
								if( Positive_Money_Flow > 1.68716e+06 )
									ret := -0.300000
						if( ad > -67303.6 )
							if( Negative_Money_Flow_Sum <= 1.3083e+07 )
								if( Raw_Money_Flow <= 375297 )
									ret := -0.166667
								if( Raw_Money_Flow > 375297 )
									ret := -0.748092 // sell
							if( Negative_Money_Flow_Sum > 1.3083e+07 )
								if( Positive_Money_Flow <= 2.16719e+06 )
									ret := -0.249123
								if( Positive_Money_Flow > 2.16719e+06 )
									ret := 0.680000
					if( Negative_Money_Flow > 929367 )
						if( ad <= -102287 )
							if( MFI <= 7.57678 )
								if( MFI_Low <= -13.9809 )
									ret := 0.333333
								if( MFI_Low > -13.9809 )
									ret := -0.666667
							if( MFI > 7.57678 )
								if( Negative_Money_Flow_Sum <= 3.29142e+07 )
									ret := 0.848485 // buy
								if( Negative_Money_Flow_Sum > 3.29142e+07 )
									ret := -0.090909
						if( ad > -102287 )
							if( Raw_Money_Flow <= 1.47413e+06 )
								if( Money_Flow_Ratio <= 0.24046 )
									ret := 0.519084
								if( Money_Flow_Ratio > 0.24046 )
									ret := -0.084507
							if( Raw_Money_Flow > 1.47413e+06 )
								if( Money_Flow_Ratio <= 0.106152 )
									ret := -0.076923
								if( Money_Flow_Ratio > 0.106152 )
									ret := -0.463054
			if( Money_Flow_Ratio > 0.31589 )
				if( MFI_High <= -50.4796 )
					if( Positive_Money_Flow_Sum <= 4.71954e+06 )
						if( ad_mf <= -22258.2 )
							if( Raw_Money_Flow <= 274521 )
								if( Positive_Money_Flow_Sum <= 1.57635e+06 )
									ret := 0.021978
								if( Positive_Money_Flow_Sum > 1.57635e+06 )
									ret := -0.642857
							if( Raw_Money_Flow > 274521 )
								if( Raw_Money_Flow <= 1.54545e+06 )
									ret := 0.284546
								if( Raw_Money_Flow > 1.54545e+06 )
									ret := -0.028986
						if( ad_mf > -22258.2 )
							if( Positive_Money_Flow_Sum <= 2.96095e+06 )
								if( Positive_Money_Flow <= 502676 )
									ret := 0.031483
								if( Positive_Money_Flow > 502676 )
									ret := 0.344051
							if( Positive_Money_Flow_Sum > 2.96095e+06 )
								if( Negative_Money_Flow_Sum <= 9.43442e+06 )
									ret := -0.393162
								if( Negative_Money_Flow_Sum > 9.43442e+06 )
									ret := -0.014245
					if( Positive_Money_Flow_Sum > 4.71954e+06 )
						if( MFI_High <= -53.0632 )
							if( Negative_Money_Flow_Sum <= 1.51369e+07 )
								if( MFI_Low <= 6.31229 )
									ret := 0.476190
								if( MFI_Low > 6.31229 )
									ret := 0.962963 // buy
							if( Negative_Money_Flow_Sum > 1.51369e+07 )
								if( Negative_Money_Flow <= 1.61446e+06 )
									ret := 0.239044
								if( Negative_Money_Flow > 1.61446e+06 )
									ret := -0.611111
						if( MFI_High > -53.0632 )
							if( ad_mf <= 148010 )
								if( Raw_Money_Flow <= 2.032e+06 )
									ret := 0.540839
								if( Raw_Money_Flow > 2.032e+06 )
									ret := 0.021053
							if( ad_mf > 148010 )
								ret := 0.950000 // buy
				if( MFI_High > -50.4796 )
					if( Positive_Money_Flow_Sum <= 1.16224e+06 )
						if( Money_Flow_Ratio <= 0.463977 )
							if( Money_Flow_Ratio <= 0.420727 )
								if( Positive_Money_Flow_Sum <= 938322 )
									ret := -0.343750
								if( Positive_Money_Flow_Sum > 938322 )
									ret := -0.720000 // sell
							if( Money_Flow_Ratio > 0.420727 )
								if( MFI_Low <= 11.3553 )
									ret := -0.066667
								if( MFI_Low > 11.3553 )
									ret := -0.323864
						if( Money_Flow_Ratio > 0.463977 )
							if( Money_Flow_Ratio <= 0.563088 )
								if( ad_mf <= 18246.5 )
									ret := 0.057052
								if( ad_mf > 18246.5 )
									ret := -0.253247
							if( Money_Flow_Ratio > 0.563088 )
								if( ad <= -26520.2 )
									ret := 0.470588
								if( ad > -26520.2 )
									ret := -0.154054
					if( Positive_Money_Flow_Sum > 1.16224e+06 )
						if( Negative_Money_Flow <= 1591.68 )
							if( Raw_Money_Flow <= 200467 )
								if( Typical_Price <= 13.0377 )
									ret := 0.285714
								if( Typical_Price > 13.0377 )
									ret := -0.021978
							if( Raw_Money_Flow > 200467 )
								if( Negative_Money_Flow_Sum <= 1.83437e+07 )
									ret := 0.017507
								if( Negative_Money_Flow_Sum > 1.83437e+07 )
									ret := -0.373418
						if( Negative_Money_Flow > 1591.68 )
							if( ad <= -25771.9 )
								if( MFI <= 35.3063 )
									ret := -0.024089
								if( MFI > 35.3063 )
									ret := 0.289157
							if( ad > -25771.9 )
								if( ad_mf <= -7846.63 )
									ret := 0.273498
								if( ad_mf > -7846.63 )
									ret := 0.070278
		if( Raw_Money_Flow > 2.77271e+06 )
			if( MFI <= 27.0783 )
				if( Positive_Money_Flow <= 4.10092e+06 )
					if( Positive_Money_Flow_Sum <= 3.42587e+06 )
						if( Positive_Money_Flow_Sum <= 1.81111e+06 )
							if( MFI <= 5.88467 )
								if( Positive_Money_Flow_Sum <= 1.15204e+06 )
									ret := 0.944444 // buy
								if( Positive_Money_Flow_Sum > 1.15204e+06 )
									ret := 0.600000
							if( MFI > 5.88467 )
								if( Money_Flow_Ratio <= 0.101125 )
									ret := 0.038462
								if( Money_Flow_Ratio > 0.101125 )
									ret := 0.542553
						if( Positive_Money_Flow_Sum > 1.81111e+06 )
							if( mf <= 0.062236 )
								if( MFI_High <= -68.3743 )
									ret := 0.315789
								if( MFI_High > -68.3743 )
									ret := -0.243902
							if( mf > 0.062236 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.42587e+06 )
						if( ad_mf <= -405330 )
							ret := 1.000000 // buy
						if( ad_mf > -405330 )
							if( ad <= -335300 )
								ret := -0.214286
							if( ad > -335300 )
								if( MFI_Low <= -1.22434 )
									ret := 0.477612
								if( MFI_Low > -1.22434 )
									ret := 0.739464 // buy
				if( Positive_Money_Flow > 4.10092e+06 )
					if( ad_mf <= 108325 )
						ret := -1.000000 // sell
					if( ad_mf > 108325 )
						if( MFI_Low <= 5.67094 )
							if( Positive_Money_Flow_Sum <= 1.58023e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.58023e+07 )
								ret := 1.000000 // buy
						if( MFI_Low > 5.67094 )
							ret := -0.769231 // sell
			if( MFI > 27.0783 )
				if( ad_mf <= 166093 )
					if( mf <= -0.144009 )
						if( Raw_Money_Flow <= 3.58779e+06 )
							if( Positive_Money_Flow_Sum <= 1.09381e+07 )
								if( Negative_Money_Flow <= 2.87953e+06 )
									ret := 0.916667 // buy
								if( Negative_Money_Flow > 2.87953e+06 )
									ret := -0.352941
							if( Positive_Money_Flow_Sum > 1.09381e+07 )
								ret := -0.894737 // sell
						if( Raw_Money_Flow > 3.58779e+06 )
							if( Raw_Money_Flow <= 3.98036e+06 )
								ret := 0.444444
							if( Raw_Money_Flow > 3.98036e+06 )
								if( Typical_Price <= 17.656 )
									ret := 0.782609 // buy
								if( Typical_Price > 17.656 )
									ret := 1.000000 // buy
					if( mf > -0.144009 )
						if( Negative_Money_Flow <= 3.61417e+06 )
							if( Positive_Money_Flow <= 3.30939e+06 )
								if( ad_mf <= -157529 )
									ret := -0.421053
								if( ad_mf > -157529 )
									ret := 0.449438
							if( Positive_Money_Flow > 3.30939e+06 )
								if( Money_Flow_Ratio <= 0.545917 )
									ret := -0.812500 // sell
								if( Money_Flow_Ratio > 0.545917 )
									ret := 0.090909
						if( Negative_Money_Flow > 3.61417e+06 )
							if( Typical_Price <= 17.9033 )
								if( Positive_Money_Flow_Sum <= 5.41851e+06 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 5.41851e+06 )
									ret := -0.809524 // sell
							if( Typical_Price > 17.9033 )
								if( Typical_Price <= 20.0082 )
									ret := 0.148148
								if( Typical_Price > 20.0082 )
									ret := -0.857143 // sell
				if( ad_mf > 166093 )
					if( MFI <= 29.9441 )
						ret := 0.692308
					if( MFI > 29.9441 )
						if( Raw_Money_Flow <= 5.09436e+06 )
							ret := 0.777778 // buy
						if( Raw_Money_Flow > 5.09436e+06 )
							ret := 1.000000 // buy
	if( MFI > 36.781 )
		if( Positive_Money_Flow <= 619020 )
			if( MFI <= 79.8761 )
				if( Typical_Price <= 6.88828 )
					if( MFI <= 37.8855 )
						if( Raw_Money_Flow <= 589585 )
							if( Negative_Money_Flow_Sum <= 4.30269e+06 )
								if( Positive_Money_Flow <= 394849 )
									ret := -0.166292
								if( Positive_Money_Flow > 394849 )
									ret := -0.916667 // sell
							if( Negative_Money_Flow_Sum > 4.30269e+06 )
								if( Typical_Price <= 6.644 )
									ret := -0.187500
								if( Typical_Price > 6.644 )
									ret := -0.821429 // sell
						if( Raw_Money_Flow > 589585 )
							if( Money_Flow_Ratio <= 0.597182 )
								if( Typical_Price <= 6.35379 )
									ret := 0.857143 // buy
								if( Typical_Price > 6.35379 )
									ret := 0.230769
							if( Money_Flow_Ratio > 0.597182 )
								ret := 0.000000
					if( MFI > 37.8855 )
						if( ad <= -27044.1 )
							if( MFI_High <= -6.6144 )
								if( ad_mf <= -150251 )
									ret := 0.524590
								if( ad_mf > -150251 )
									ret := 0.143183
							if( MFI_High > -6.6144 )
								if( ad <= -44485.7 )
									ret := -0.523077
								if( ad > -44485.7 )
									ret := 0.162500
						if( ad > -27044.1 )
							if( Negative_Money_Flow_Sum <= 7.28711e+06 )
								if( Negative_Money_Flow_Sum <= 869043 )
									ret := -0.011287
								if( Negative_Money_Flow_Sum > 869043 )
									ret := 0.052771
							if( Negative_Money_Flow_Sum > 7.28711e+06 )
								if( Money_Flow_Ratio <= 1.16941 )
									ret := -0.781250 // sell
								if( Money_Flow_Ratio > 1.16941 )
									ret := -0.166667
				if( Typical_Price > 6.88828 )
					if( Negative_Money_Flow <= 612649 )
						if( Raw_Money_Flow <= 212378 )
							if( Positive_Money_Flow_Sum <= 1.35275e+06 )
								if( MFI_High <= -29.8094 )
									ret := -0.099504
								if( MFI_High > -29.8094 )
									ret := -0.000641
							if( Positive_Money_Flow_Sum > 1.35275e+06 )
								if( MFI_Low <= 19.6463 )
									ret := -0.179612
								if( MFI_Low > 19.6463 )
									ret := 0.048822
						if( Raw_Money_Flow > 212378 )
							if( MFI_Low <= 40.7224 )
								if( Positive_Money_Flow_Sum <= 1.5533e+06 )
									ret := -0.146778
								if( Positive_Money_Flow_Sum > 1.5533e+06 )
									ret := -0.018983
							if( MFI_Low > 40.7224 )
								if( Positive_Money_Flow_Sum <= 2.51289e+06 )
									ret := 0.073798
								if( Positive_Money_Flow_Sum > 2.51289e+06 )
									ret := -0.122983
					if( Negative_Money_Flow > 612649 )
						if( Raw_Money_Flow <= 1.01409e+06 )
							if( MFI <= 74.7573 )
								if( ad_mf <= -33665.9 )
									ret := 0.205796
								if( ad_mf > -33665.9 )
									ret := 0.039236
							if( MFI > 74.7573 )
								if( Positive_Money_Flow_Sum <= 1.33071e+07 )
									ret := -0.146199
								if( Positive_Money_Flow_Sum > 1.33071e+07 )
									ret := -0.747253 // sell
						if( Raw_Money_Flow > 1.01409e+06 )
							if( MFI_High <= -4.08616 )
								if( MFI <= 67.3121 )
									ret := -0.029776
								if( MFI > 67.3121 )
									ret := -0.275581
							if( MFI_High > -4.08616 )
								if( Positive_Money_Flow_Sum <= 9.72498e+06 )
									ret := 0.846154 // buy
								if( Positive_Money_Flow_Sum > 9.72498e+06 )
									ret := 0.210256
			if( MFI > 79.8761 )
				if( MFI_High <= 4.93103 )
					if( Raw_Money_Flow <= 439237 )
						if( Raw_Money_Flow <= 304540 )
							if( Positive_Money_Flow_Sum <= 3.0144e+06 )
								if( mf <= 0.300495 )
									ret := 0.028146
								if( mf > 0.300495 )
									ret := 0.321839
							if( Positive_Money_Flow_Sum > 3.0144e+06 )
								if( Negative_Money_Flow_Sum <= 1.25195e+06 )
									ret := 0.313883
								if( Negative_Money_Flow_Sum > 1.25195e+06 )
									ret := 0.000000
						if( Raw_Money_Flow > 304540 )
							if( MFI <= 84.7959 )
								if( Money_Flow_Ratio <= 4.05216 )
									ret := 0.567568
								if( Money_Flow_Ratio > 4.05216 )
									ret := -0.177215
							if( MFI > 84.7959 )
								ret := 0.818182 // buy
					if( Raw_Money_Flow > 439237 )
						if( Positive_Money_Flow_Sum <= 1.35131e+07 )
							if( Negative_Money_Flow_Sum <= 1.55316e+06 )
								if( Money_Flow_Ratio <= 4.01182 )
									ret := 0.900000 // buy
								if( Money_Flow_Ratio > 4.01182 )
									ret := 0.166038
							if( Negative_Money_Flow_Sum > 1.55316e+06 )
								if( Money_Flow_Ratio <= 5.0638 )
									ret := 0.608911
								if( Money_Flow_Ratio > 5.0638 )
									ret := 0.275862
						if( Positive_Money_Flow_Sum > 1.35131e+07 )
							if( Negative_Money_Flow_Sum <= 2.80346e+06 )
								if( Money_Flow_Ratio <= 5.04778 )
									ret := -0.956522 // sell
								if( Money_Flow_Ratio > 5.04778 )
									ret := 0.076923
							if( Negative_Money_Flow_Sum > 2.80346e+06 )
								if( ad_mf <= -159549 )
									ret := 0.580645
								if( ad_mf > -159549 )
									ret := 0.139535
				if( MFI_High > 4.93103 )
					if( MFI_High <= 15.5441 )
						if( Money_Flow_Ratio <= 5.8511 )
							if( Negative_Money_Flow_Sum <= 652230 )
								if( Negative_Money_Flow_Sum <= 354509 )
									ret := -0.850000 // sell
								if( Negative_Money_Flow_Sum > 354509 )
									ret := -0.433962
							if( Negative_Money_Flow_Sum > 652230 )
								if( MFI_Low <= 65.2481 )
									ret := 0.142857
								if( MFI_Low > 65.2481 )
									ret := -0.727273 // sell
						if( Money_Flow_Ratio > 5.8511 )
							if( Raw_Money_Flow <= 586068 )
								if( Positive_Money_Flow <= 97169.9 )
									ret := -0.157385
								if( Positive_Money_Flow > 97169.9 )
									ret := 0.074646
							if( Raw_Money_Flow > 586068 )
								if( Money_Flow_Ratio <= 6.58749 )
									ret := 0.649351
								if( Money_Flow_Ratio > 6.58749 )
									ret := -0.048000
					if( MFI_High > 15.5441 )
						if( Raw_Money_Flow <= 561457 )
							if( Positive_Money_Flow <= 237639 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 237639 )
								ret := 0.714286 // buy
						if( Raw_Money_Flow > 561457 )
							ret := 0.384615
		if( Positive_Money_Flow > 619020 )
			if( Positive_Money_Flow <= 5.6623e+06 )
				if( Typical_Price <= 6.35683 )
					if( Raw_Money_Flow <= 1.32788e+06 )
						if( Negative_Money_Flow_Sum <= 7.31505e+06 )
							if( ad_mf <= 90207.8 )
								if( Negative_Money_Flow_Sum <= 612822 )
									ret := 0.037037
								if( Negative_Money_Flow_Sum > 612822 )
									ret := 0.388535
							if( ad_mf > 90207.8 )
								if( Positive_Money_Flow_Sum <= 5.70558e+06 )
									ret := -0.475000
								if( Positive_Money_Flow_Sum > 5.70558e+06 )
									ret := 0.150000
						if( Negative_Money_Flow_Sum > 7.31505e+06 )
							if( Money_Flow_Ratio <= 1.23976 )
								if( MFI_Low <= 24.1991 )
									ret := -0.181818
								if( MFI_Low > 24.1991 )
									ret := -0.875000 // sell
							if( Money_Flow_Ratio > 1.23976 )
								ret := 0.363636
					if( Raw_Money_Flow > 1.32788e+06 )
						if( Money_Flow_Ratio <= 1.63374 )
							if( Money_Flow_Ratio <= 0.762066 )
								ret := 0.200000
							if( Money_Flow_Ratio > 0.762066 )
								if( ad_mf <= 207673 )
									ret := 0.849057 // buy
								if( ad_mf > 207673 )
									ret := 0.294118
						if( Money_Flow_Ratio > 1.63374 )
							if( MFI <= 74.0811 )
								ret := -0.625000
							if( MFI > 74.0811 )
								if( ad <= 117006 )
									ret := -0.055556
								if( ad > 117006 )
									ret := 0.411765
				if( Typical_Price > 6.35683 )
					if( Negative_Money_Flow_Sum <= 2.03861e+06 )
						if( ad <= -93617.8 )
							if( MFI_High <= -8.79555 )
								ret := -0.625000
							if( MFI_High > -8.79555 )
								if( MFI_High <= 7.44796 )
									ret := 0.382353
								if( MFI_High > 7.44796 )
									ret := 0.675000
						if( ad > -93617.8 )
							if( ad <= 303382 )
								if( Positive_Money_Flow <= 1.97665e+06 )
									ret := -0.060561
								if( Positive_Money_Flow > 1.97665e+06 )
									ret := 0.198276
							if( ad > 303382 )
								if( Money_Flow_Ratio <= 6.3506 )
									ret := -0.176471
								if( Money_Flow_Ratio > 6.3506 )
									ret := 0.918919 // buy
					if( Negative_Money_Flow_Sum > 2.03861e+06 )
						if( Positive_Money_Flow_Sum <= 5.04072e+07 )
							if( Money_Flow_Ratio <= 0.956447 )
								if( MFI_High <= -37.8056 )
									ret := -0.150685
								if( MFI_High > -37.8056 )
									ret := 0.057170
							if( Money_Flow_Ratio > 0.956447 )
								if( Negative_Money_Flow_Sum <= 2.96567e+07 )
									ret := -0.148535
								if( Negative_Money_Flow_Sum > 2.96567e+07 )
									ret := 0.696970
						if( Positive_Money_Flow_Sum > 5.04072e+07 )
							if( Positive_Money_Flow <= 3.63441e+06 )
								if( Positive_Money_Flow <= 3.21292e+06 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow > 3.21292e+06 )
									ret := 0.272727
							if( Positive_Money_Flow > 3.63441e+06 )
								if( ad <= -2586.15 )
									ret := -0.375000
								if( ad > -2586.15 )
									ret := -1.000000 // sell
			if( Positive_Money_Flow > 5.6623e+06 )
				if( MFI_Low <= 47.5687 )
					if( MFI_High <= -32.4861 )
						ret := 0.800000 // buy
					if( MFI_High > -32.4861 )
						if( Positive_Money_Flow_Sum <= 2.58535e+07 )
							if( Typical_Price <= 14.105 )
								ret := -0.545455
							if( Typical_Price > 14.105 )
								ret := -0.944444 // sell
						if( Positive_Money_Flow_Sum > 2.58535e+07 )
							ret := 0.000000
				if( MFI_Low > 47.5687 )
					if( Positive_Money_Flow <= 1.07875e+07 )
						if( Negative_Money_Flow_Sum <= 9.50969e+06 )
							if( MFI <= 91.5714 )
								if( Negative_Money_Flow_Sum <= 6.97396e+06 )
									ret := 0.983333 // buy
								if( Negative_Money_Flow_Sum > 6.97396e+06 )
									ret := 0.850000 // buy
							if( MFI > 91.5714 )
								if( Positive_Money_Flow <= 6.12707e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 6.12707e+06 )
									ret := 0.076923
						if( Negative_Money_Flow_Sum > 9.50969e+06 )
							if( Typical_Price <= 15.9972 )
								if( ad_mf <= 247335 )
									ret := -1.000000 // sell
								if( ad_mf > 247335 )
									ret := 0.300000
							if( Typical_Price > 15.9972 )
								if( Positive_Money_Flow_Sum <= 3.08528e+07 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 3.08528e+07 )
									ret := 0.758621 // buy
					if( Positive_Money_Flow > 1.07875e+07 )
						if( Money_Flow_Ratio <= 6.58851 )
							if( MFI_High <= -5.91155 )
								ret := -0.714286 // sell
							if( MFI_High > -5.91155 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 6.58851 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_LINKUSDT_15Min_2348c87d(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


