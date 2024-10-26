//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: BABA_1Min_2MT0_dc4e7b67 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Min_2MT0_dc4e7b67", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Min_dc4e7b67(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ema12 <= -0.036643 )
		if( MFI_Low <= 7.55776 )
			if( Negative_Money_Flow <= 1.72941 )
				if( tema <= 80.6029 )
					if( ema12 <= -0.24696 )
						if( ema2 <= 79.2817 )
							if( MFI_High <= -62.2613 )
								ret := 1.000000 // buy
							if( MFI_High > -62.2613 )
								ret := 0.764706 // buy
						if( ema2 > 79.2817 )
							if( MFI_Low <= -3.4713 )
								ret := 0.500000
							if( MFI_Low > -3.4713 )
								ret := -0.090909
					if( ema12 > -0.24696 )
						if( ema13 <= -0.36523 )
							ret := -0.588235
						if( ema13 > -0.36523 )
							if( Raw_Money_Flow <= 70197.9 )
								if( Negative_Money_Flow_Sum <= 2.7856e+06 )
									ret := -0.074286
								if( Negative_Money_Flow_Sum > 2.7856e+06 )
									ret := 0.411765
							if( Raw_Money_Flow > 70197.9 )
								if( Positive_Money_Flow_Sum <= 1.67684e+07 )
									ret := 0.153365
								if( Positive_Money_Flow_Sum > 1.67684e+07 )
									ret := 0.554348
				if( tema > 80.6029 )
					if( Positive_Money_Flow_Sum <= 120881 )
						if( Positive_Money_Flow_Sum <= 96409.9 )
							ret := -0.363636
						if( Positive_Money_Flow_Sum > 96409.9 )
							ret := -0.909091 // sell
					if( Positive_Money_Flow_Sum > 120881 )
						if( Negative_Money_Flow_Sum <= 2.56319e+07 )
							if( Negative_Money_Flow_Sum <= 4.35247e+06 )
								if( ema13 <= -0.156121 )
									ret := -0.529412
								if( ema13 > -0.156121 )
									ret := 0.056604
							if( Negative_Money_Flow_Sum > 4.35247e+06 )
								if( MFI_Low <= -8.34531 )
									ret := -0.106383
								if( MFI_Low > -8.34531 )
									ret := 0.304029
						if( Negative_Money_Flow_Sum > 2.56319e+07 )
							if( Raw_Money_Flow <= 7.50793e+06 )
								if( Positive_Money_Flow_Sum <= 1.00113e+07 )
									ret := -0.478261
								if( Positive_Money_Flow_Sum > 1.00113e+07 )
									ret := -0.146497
							if( Raw_Money_Flow > 7.50793e+06 )
								if( tema <= 107.608 )
									ret := 0.569620
								if( tema > 107.608 )
									ret := -0.435897
			if( Negative_Money_Flow > 1.72941 )
				if( MFI_High <= -68.181 )
					if( ema13 <= -0.406833 )
						if( Negative_Money_Flow_Sum <= 2.27619e+07 )
							if( tema <= 76.5133 )
								ret := 0.777778 // buy
							if( tema > 76.5133 )
								if( MFI_Low <= -9.57206 )
									ret := -0.762712 // sell
								if( MFI_Low > -9.57206 )
									ret := 0.050000
						if( Negative_Money_Flow_Sum > 2.27619e+07 )
							if( tema <= 109.323 )
								if( Raw_Money_Flow <= 1.92701e+07 )
									ret := 0.916667 // buy
								if( Raw_Money_Flow > 1.92701e+07 )
									ret := 0.181818
							if( tema > 109.323 )
								ret := -0.454545
					if( ema13 > -0.406833 )
						if( Raw_Money_Flow <= 250985 )
							if( Negative_Money_Flow_Sum <= 1.86808e+06 )
								if( Raw_Money_Flow <= 24885 )
									ret := 0.000000
								if( Raw_Money_Flow > 24885 )
									ret := 0.614907
							if( Negative_Money_Flow_Sum > 1.86808e+06 )
								if( ema1 <= 77.3171 )
									ret := 0.500000
								if( ema1 > 77.3171 )
									ret := -0.071823
						if( Raw_Money_Flow > 250985 )
							if( Positive_Money_Flow_Sum <= 2.62183e+06 )
								if( ema3 <= 72.5017 )
									ret := -0.157895
								if( ema3 > 72.5017 )
									ret := 0.640523
							if( Positive_Money_Flow_Sum > 2.62183e+06 )
								if( Typical_Price <= 81.0647 )
									ret := 0.482759
								if( Typical_Price > 81.0647 )
									ret := 0.083333
				if( MFI_High > -68.181 )
					if( Negative_Money_Flow <= 139777 )
						if( Raw_Money_Flow <= 76639 )
							if( ema13 <= -0.240946 )
								if( Positive_Money_Flow_Sum <= 346205 )
									ret := -0.617647
								if( Positive_Money_Flow_Sum > 346205 )
									ret := 0.526316
							if( ema13 > -0.240946 )
								if( Positive_Money_Flow <= 7446.02 )
									ret := 0.280277
								if( Positive_Money_Flow > 7446.02 )
									ret := 0.739130 // buy
						if( Raw_Money_Flow > 76639 )
							if( MFI <= 12.2108 )
								ret := -0.157895
							if( MFI > 12.2108 )
								if( Money_Flow_Ratio <= 0.173626 )
									ret := 0.830986 // buy
								if( Money_Flow_Ratio > 0.173626 )
									ret := 0.532000
					if( Negative_Money_Flow > 139777 )
						if( MFI_High <= -57.5259 )
							if( ema13 <= -1.31428 )
								if( Typical_Price <= 105.184 )
									ret := -1.000000 // sell
								if( Typical_Price > 105.184 )
									ret := -0.777778 // sell
							if( ema13 > -1.31428 )
								if( Negative_Money_Flow <= 1.32182e+07 )
									ret := 0.034567
								if( Negative_Money_Flow > 1.32182e+07 )
									ret := 0.389262
						if( MFI_High > -57.5259 )
							if( Negative_Money_Flow_Sum <= 658244 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 658244 )
								if( ema13 <= -0.148986 )
									ret := 0.457308
								if( ema13 > -0.148986 )
									ret := 0.163594
		if( MFI_Low > 7.55776 )
			if( Positive_Money_Flow_Sum <= 2.27911e+08 )
				if( ema2 <= 114.578 )
					if( Money_Flow_Ratio <= 3.1776 )
						if( Negative_Money_Flow_Sum <= 519119 )
							if( ema12 <= -0.047446 )
								if( Negative_Money_Flow <= 7839.75 )
									ret := -0.494253
								if( Negative_Money_Flow > 7839.75 )
									ret := -0.095238
							if( ema12 > -0.047446 )
								if( Negative_Money_Flow_Sum <= 272691 )
									ret := 0.595238
								if( Negative_Money_Flow_Sum > 272691 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 519119 )
							if( ema13 <= -0.131364 )
								if( MFI <= 71.661 )
									ret := 0.133001
								if( MFI > 71.661 )
									ret := -0.774194 // sell
							if( ema13 > -0.131364 )
								if( Positive_Money_Flow_Sum <= 5.89785e+06 )
									ret := 0.220923
								if( Positive_Money_Flow_Sum > 5.89785e+06 )
									ret := -0.026014
					if( Money_Flow_Ratio > 3.1776 )
						if( Raw_Money_Flow <= 205086 )
							if( tema <= 79.8662 )
								if( ema12 <= -0.067441 )
									ret := 1.000000 // buy
								if( ema12 > -0.067441 )
									ret := 0.186047
							if( tema > 79.8662 )
								if( Positive_Money_Flow <= 79403.3 )
									ret := -0.179487
								if( Positive_Money_Flow > 79403.3 )
									ret := -0.789474 // sell
						if( Raw_Money_Flow > 205086 )
							if( Positive_Money_Flow_Sum <= 5.54263e+07 )
								if( ema2 <= 80.4056 )
									ret := 0.700000 // buy
								if( ema2 > 80.4056 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.54263e+07 )
								ret := 0.117647
				if( ema2 > 114.578 )
					if( Positive_Money_Flow_Sum <= 7.00883e+07 )
						if( ema3 <= 117.902 )
							if( Raw_Money_Flow <= 661925 )
								if( ema12 <= -0.042247 )
									ret := 0.385965
								if( ema12 > -0.042247 )
									ret := -0.238095
							if( Raw_Money_Flow > 661925 )
								if( Negative_Money_Flow_Sum <= 8.14983e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 8.14983e+06 )
									ret := 0.006667
						if( ema3 > 117.902 )
							ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 7.00883e+07 )
						if( Positive_Money_Flow_Sum <= 1.67544e+08 )
							if( ema3 <= 116.255 )
								if( ema12 <= -0.170153 )
									ret := -0.636364
								if( ema12 > -0.170153 )
									ret := -0.980000 // sell
							if( ema3 > 116.255 )
								ret := -0.181818
						if( Positive_Money_Flow_Sum > 1.67544e+08 )
							ret := 0.043478
			if( Positive_Money_Flow_Sum > 2.27911e+08 )
				if( ema13 <= -0.144409 )
					if( Raw_Money_Flow <= 3.3937e+07 )
						ret := 0.666667
					if( Raw_Money_Flow > 3.3937e+07 )
						if( MFI_High <= -26.4895 )
							ret := 1.000000 // buy
						if( MFI_High > -26.4895 )
							ret := 0.875000 // buy
				if( ema13 > -0.144409 )
					ret := -0.272727
	if( ema12 > -0.036643 )
		if( Positive_Money_Flow <= 445.278 )
			if( Negative_Money_Flow_Sum <= 1.43134e+06 )
				if( MFI_High <= -35.3029 )
					if( Negative_Money_Flow <= 801.725 )
						if( Money_Flow_Ratio <= 0.721821 )
							if( Positive_Money_Flow_Sum <= 60715.9 )
								if( tema <= 76.986 )
									ret := 0.500000
								if( tema > 76.986 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 60715.9 )
								if( MFI_Low <= 11.4748 )
									ret := -0.183908
								if( MFI_Low > 11.4748 )
									ret := -0.034483
						if( Money_Flow_Ratio > 0.721821 )
							if( Raw_Money_Flow <= 38934.4 )
								if( ema13 <= -0.025866 )
									ret := 0.125000
								if( ema13 > -0.025866 )
									ret := 0.000000
							if( Raw_Money_Flow > 38934.4 )
								if( Raw_Money_Flow <= 86907 )
									ret := 0.777778 // buy
								if( Raw_Money_Flow > 86907 )
									ret := 0.250000
					if( Negative_Money_Flow > 801.725 )
						if( MFI_Low <= 20.1607 )
							if( ema13 <= -0.080529 )
								if( Negative_Money_Flow_Sum <= 954140 )
									ret := -0.733333 // sell
								if( Negative_Money_Flow_Sum > 954140 )
									ret := -0.176471
							if( ema13 > -0.080529 )
								if( Positive_Money_Flow_Sum <= 592216 )
									ret := 0.146586
								if( Positive_Money_Flow_Sum > 592216 )
									ret := -0.121622
						if( MFI_Low > 20.1607 )
							if( ema13 <= -0.034273 )
								if( ema13 <= -0.047454 )
									ret := -0.048780
								if( ema13 > -0.047454 )
									ret := -0.688889
							if( ema13 > -0.034273 )
								if( Negative_Money_Flow_Sum <= 974110 )
									ret := -0.038363
								if( Negative_Money_Flow_Sum > 974110 )
									ret := 0.355140
				if( MFI_High > -35.3029 )
					if( ema3 <= 78.6406 )
						if( ema12 <= -0.022059 )
							if( ema13 <= -0.031719 )
								if( tema <= 75.5341 )
									ret := 0.157895
								if( tema > 75.5341 )
									ret := 0.513158
							if( ema13 > -0.031719 )
								if( Money_Flow_Ratio <= 1.76079 )
									ret := 0.473684
								if( Money_Flow_Ratio > 1.76079 )
									ret := 1.000000 // buy
						if( ema12 > -0.022059 )
							if( Negative_Money_Flow <= 994.146 )
								if( Positive_Money_Flow_Sum <= 437485 )
									ret := 0.143590
								if( Positive_Money_Flow_Sum > 437485 )
									ret := -0.051852
							if( Negative_Money_Flow > 994.146 )
								if( ema12 <= 0.232067 )
									ret := 0.240909
								if( ema12 > 0.232067 )
									ret := 0.760000 // buy
					if( ema3 > 78.6406 )
						if( Raw_Money_Flow <= 40627.2 )
							if( tema <= 79.1797 )
								if( ema12 <= -0.005934 )
									ret := 0.352941
								if( ema12 > -0.005934 )
									ret := -0.328000
							if( tema > 79.1797 )
								if( ema12 <= 0.084603 )
									ret := 0.056094
								if( ema12 > 0.084603 )
									ret := 0.596154
						if( Raw_Money_Flow > 40627.2 )
							if( Positive_Money_Flow_Sum <= 3.12166e+06 )
								if( MFI_High <= 9.28049 )
									ret := 0.166081
								if( MFI_High > 9.28049 )
									ret := 0.559322
							if( Positive_Money_Flow_Sum > 3.12166e+06 )
								if( ema12 <= 0.027022 )
									ret := 0.306748
								if( ema12 > 0.027022 )
									ret := -0.402597
			if( Negative_Money_Flow_Sum > 1.43134e+06 )
				if( ema12 <= 0.663753 )
					if( Money_Flow_Ratio <= 3.74397 )
						if( ema3 <= 107.806 )
							if( Negative_Money_Flow_Sum <= 2.26972e+06 )
								if( Raw_Money_Flow <= 43712.4 )
									ret := 0.173684
								if( Raw_Money_Flow > 43712.4 )
									ret := -0.144289
							if( Negative_Money_Flow_Sum > 2.26972e+06 )
								if( Positive_Money_Flow_Sum <= 7.50585e+07 )
									ret := 0.045130
								if( Positive_Money_Flow_Sum > 7.50585e+07 )
									ret := 0.192346
						if( ema3 > 107.806 )
							if( MFI_Low <= 31.79 )
								if( ema13 <= 0.023956 )
									ret := -0.062724
								if( ema13 > 0.023956 )
									ret := 0.230971
							if( MFI_Low > 31.79 )
								if( ema12 <= 0.189572 )
									ret := -0.121053
								if( ema12 > 0.189572 )
									ret := -0.689655
					if( Money_Flow_Ratio > 3.74397 )
						if( Negative_Money_Flow <= 5.57708e+06 )
							if( Negative_Money_Flow <= 734519 )
								if( Money_Flow_Ratio <= 3.94579 )
									ret := 0.531250
								if( Money_Flow_Ratio > 3.94579 )
									ret := -0.039711
							if( Negative_Money_Flow > 734519 )
								if( ema1 <= 74.8745 )
									ret := 0.000000
								if( ema1 > 74.8745 )
									ret := 0.417989
						if( Negative_Money_Flow > 5.57708e+06 )
							if( Positive_Money_Flow_Sum <= 1.07061e+08 )
								if( ema12 <= 0.126175 )
									ret := -0.305556
								if( ema12 > 0.126175 )
									ret := -0.941176 // sell
							if( Positive_Money_Flow_Sum > 1.07061e+08 )
								if( ema2 <= 83.8298 )
									ret := 0.925926 // buy
								if( ema2 > 83.8298 )
									ret := -0.239130
				if( ema12 > 0.663753 )
					if( Negative_Money_Flow_Sum <= 5.31327e+06 )
						ret := -0.642857
					if( Negative_Money_Flow_Sum > 5.31327e+06 )
						ret := -1.000000 // sell
		if( Positive_Money_Flow > 445.278 )
			if( Positive_Money_Flow_Sum <= 4.64838e+07 )
				if( MFI_Low <= -4.42575 )
					if( ema13 <= -0.042638 )
						if( Positive_Money_Flow_Sum <= 9.66519e+06 )
							if( ema12 <= -0.035678 )
								ret := -0.571429
							if( ema12 > -0.035678 )
								if( Negative_Money_Flow <= 4781.79 )
									ret := 0.121951
								if( Negative_Money_Flow > 4781.79 )
									ret := 0.581395
						if( Positive_Money_Flow_Sum > 9.66519e+06 )
							ret := -0.666667
					if( ema13 > -0.042638 )
						if( Negative_Money_Flow <= 40007.1 )
							if( ema12 <= 0.046489 )
								if( Negative_Money_Flow_Sum <= 5.17174e+06 )
									ret := -0.401130
								if( Negative_Money_Flow_Sum > 5.17174e+06 )
									ret := -0.050314
							if( ema12 > 0.046489 )
								if( ema13 <= 0.100679 )
									ret := -0.800000 // sell
								if( ema13 > 0.100679 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 40007.1 )
							if( ema1 <= 79.7413 )
								if( ema12 <= 0.014975 )
									ret := 0.000000
								if( ema12 > 0.014975 )
									ret := -1.000000 // sell
							if( ema1 > 79.7413 )
								ret := -1.000000 // sell
				if( MFI_Low > -4.42575 )
					if( Negative_Money_Flow_Sum <= 574738 )
						if( Negative_Money_Flow_Sum <= 315971 )
							if( ema2 <= 75.0844 )
								if( MFI <= 68.2906 )
									ret := 0.018116
								if( MFI > 68.2906 )
									ret := 0.309278
							if( ema2 > 75.0844 )
								if( MFI <= 44.5406 )
									ret := -0.271605
								if( MFI > 44.5406 )
									ret := -0.005680
						if( Negative_Money_Flow_Sum > 315971 )
							if( ema12 <= 0.014678 )
								if( ema1 <= 82.111 )
									ret := -0.109052
								if( ema1 > 82.111 )
									ret := 0.101392
							if( ema12 > 0.014678 )
								if( Negative_Money_Flow_Sum <= 412301 )
									ret := -0.123529
								if( Negative_Money_Flow_Sum > 412301 )
									ret := -0.376147
					if( Negative_Money_Flow_Sum > 574738 )
						if( Money_Flow_Ratio <= 4.31479 )
							if( ema13 <= 0.019964 )
								if( Raw_Money_Flow <= 9.75689e+06 )
									ret := -0.002030
								if( Raw_Money_Flow > 9.75689e+06 )
									ret := -0.401639
							if( ema13 > 0.019964 )
								if( Positive_Money_Flow_Sum <= 5.28652e+06 )
									ret := 0.111493
								if( Positive_Money_Flow_Sum > 5.28652e+06 )
									ret := 0.032040
						if( Money_Flow_Ratio > 4.31479 )
							if( ema12 <= 0.206058 )
								if( ema13 <= 0.013358 )
									ret := 0.122744
								if( ema13 > 0.013358 )
									ret := -0.131748
							if( ema12 > 0.206058 )
								if( ema2 <= 82.0223 )
									ret := -0.130435
								if( ema2 > 82.0223 )
									ret := -0.787879 // sell
			if( Positive_Money_Flow_Sum > 4.64838e+07 )
				if( ema12 <= 0.032624 )
					if( ema13 <= 0.066992 )
						if( ema13 <= -0.106267 )
							if( ema2 <= 86.0766 )
								ret := -0.153846
							if( ema2 > 86.0766 )
								if( Negative_Money_Flow_Sum <= 1.47089e+08 )
									ret := 0.884615 // buy
								if( Negative_Money_Flow_Sum > 1.47089e+08 )
									ret := 0.384615
						if( ema13 > -0.106267 )
							if( MFI_High <= -46.3153 )
								if( Raw_Money_Flow <= 5.51539e+06 )
									ret := -0.388889
								if( Raw_Money_Flow > 5.51539e+06 )
									ret := -1.000000 // sell
							if( MFI_High > -46.3153 )
								if( ema12 <= 0.014251 )
									ret := 0.012285
								if( ema12 > 0.014251 )
									ret := -0.183673
					if( ema13 > 0.066992 )
						if( tema <= 109.932 )
							if( Negative_Money_Flow_Sum <= 4.74867e+07 )
								if( ema13 <= 0.072792 )
									ret := 0.882353 // buy
								if( ema13 > 0.072792 )
									ret := 0.434783
							if( Negative_Money_Flow_Sum > 4.74867e+07 )
								if( Positive_Money_Flow_Sum <= 1.24702e+08 )
									ret := -0.358974
								if( Positive_Money_Flow_Sum > 1.24702e+08 )
									ret := 0.421053
						if( tema > 109.932 )
							if( Positive_Money_Flow <= 8.68829e+06 )
								ret := 0.500000
							if( Positive_Money_Flow > 8.68829e+06 )
								ret := 1.000000 // buy
				if( ema12 > 0.032624 )
					if( Raw_Money_Flow <= 2.48942e+07 )
						if( ema13 <= 0.215059 )
							if( Negative_Money_Flow_Sum <= 1.48319e+07 )
								if( Positive_Money_Flow_Sum <= 6.33047e+07 )
									ret := 0.176471
								if( Positive_Money_Flow_Sum > 6.33047e+07 )
									ret := -0.304636
							if( Negative_Money_Flow_Sum > 1.48319e+07 )
								if( Negative_Money_Flow_Sum <= 8.93117e+07 )
									ret := 0.342529
								if( Negative_Money_Flow_Sum > 8.93117e+07 )
									ret := -0.066265
						if( ema13 > 0.215059 )
							if( Raw_Money_Flow <= 2.90958e+06 )
								if( ema12 <= 0.160679 )
									ret := 1.000000 // buy
								if( ema12 > 0.160679 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 2.90958e+06 )
								if( Typical_Price <= 110.218 )
									ret := 0.106072
								if( Typical_Price > 110.218 )
									ret := -0.318966
					if( Raw_Money_Flow > 2.48942e+07 )
						if( Raw_Money_Flow <= 2.69372e+07 )
							if( Raw_Money_Flow <= 2.56075e+07 )
								ret := -0.052632
							if( Raw_Money_Flow > 2.56075e+07 )
								if( MFI_High <= -12.9918 )
									ret := -0.818182 // sell
								if( MFI_High > -12.9918 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.69372e+07 )
							if( ema12 <= 0.057922 )
								if( Positive_Money_Flow_Sum <= 8.75701e+07 )
									ret := 0.222222
								if( Positive_Money_Flow_Sum > 8.75701e+07 )
									ret := -0.864865 // sell
							if( ema12 > 0.057922 )
								if( Negative_Money_Flow_Sum <= 2.27666e+08 )
									ret := 0.141414
								if( Negative_Money_Flow_Sum > 2.27666e+08 )
									ret := -0.758621 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_BABA_1Min_dc4e7b67(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


