//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: APPS_15Min_2MT0_91eb5391 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2MT0_91eb5391", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_91eb5391(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.000107 )
		if( Negative_Money_Flow <= 3.96079 )
			if( Positive_Money_Flow <= 60872.8 )
				if( Raw_Money_Flow <= 19856.9 )
					if( MFI_High <= -34.7973 )
						if( Positive_Money_Flow <= 15051.7 )
							if( Raw_Money_Flow <= 637.065 )
								if( Typical_Price <= 4.00918 )
									ret := -0.326964
								if( Typical_Price > 4.00918 )
									ret := 0.314286
							if( Raw_Money_Flow > 637.065 )
								if( Money_Flow_Ratio <= 0.081443 )
									ret := -0.269841
								if( Money_Flow_Ratio > 0.081443 )
									ret := -0.070889
						if( Positive_Money_Flow > 15051.7 )
							if( ema1 <= 1.65523 )
								if( Typical_Price <= 1.56726 )
									ret := 0.155556
								if( Typical_Price > 1.56726 )
									ret := 0.724138 // buy
							if( ema1 > 1.65523 )
								if( Positive_Money_Flow_Sum <= 38146.5 )
									ret := -0.625000
								if( Positive_Money_Flow_Sum > 38146.5 )
									ret := -0.026616
					if( MFI_High > -34.7973 )
						if( MFI_High <= -28.1854 )
							if( ema1 <= 0.691226 )
								if( Money_Flow_Ratio <= 0.902408 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.902408 )
									ret := 0.454545
							if( ema1 > 0.691226 )
								if( ema12 <= -0.013045 )
									ret := 0.430622
								if( ema12 > -0.013045 )
									ret := 0.051873
						if( MFI_High > -28.1854 )
							if( Money_Flow_Ratio <= 158.864 )
								if( ema2 <= 6.35679 )
									ret := 0.056604
								if( ema2 > 6.35679 )
									ret := -0.140594
							if( Money_Flow_Ratio > 158.864 )
								ret := 0.937500 // buy
				if( Raw_Money_Flow > 19856.9 )
					if( Positive_Money_Flow <= 1456.49 )
						if( Positive_Money_Flow_Sum <= 20130.5 )
							ret := -0.666667
						if( Positive_Money_Flow_Sum > 20130.5 )
							if( Negative_Money_Flow_Sum <= 444940 )
								if( Money_Flow_Ratio <= 0.566331 )
									ret := 0.657895
								if( Money_Flow_Ratio > 0.566331 )
									ret := 0.216216
							if( Negative_Money_Flow_Sum > 444940 )
								if( ema13 <= -0.028027 )
									ret := 0.074766
								if( ema13 > -0.028027 )
									ret := -0.139785
					if( Positive_Money_Flow > 1456.49 )
						if( Money_Flow_Ratio <= 1.8748 )
							if( ema1 <= 4.29995 )
								if( Negative_Money_Flow_Sum <= 41934.1 )
									ret := 0.837838 // buy
								if( Negative_Money_Flow_Sum > 41934.1 )
									ret := -0.162832
							if( ema1 > 4.29995 )
								if( ema2 <= 10.7798 )
									ret := -0.533582
								if( ema2 > 10.7798 )
									ret := -0.196787
						if( Money_Flow_Ratio > 1.8748 )
							if( Typical_Price <= 18.9032 )
								if( Money_Flow_Ratio <= 3.62144 )
									ret := 0.033333
								if( Money_Flow_Ratio > 3.62144 )
									ret := -0.545455
							if( Typical_Price > 18.9032 )
								if( Typical_Price <= 56.9367 )
									ret := 0.494382
								if( Typical_Price > 56.9367 )
									ret := -0.264706
			if( Positive_Money_Flow > 60872.8 )
				if( ema3 <= 77.989 )
					if( Raw_Money_Flow <= 1.29455e+07 )
						if( Positive_Money_Flow <= 2.08452e+06 )
							if( MFI_High <= 3.60991 )
								if( Raw_Money_Flow <= 396524 )
									ret := -0.018483
								if( Raw_Money_Flow > 396524 )
									ret := 0.120933
							if( MFI_High > 3.60991 )
								if( Typical_Price <= 17.2609 )
									ret := 0.108434
								if( Typical_Price > 17.2609 )
									ret := 0.777778 // buy
						if( Positive_Money_Flow > 2.08452e+06 )
							if( Negative_Money_Flow_Sum <= 2.5118e+07 )
								if( ema1 <= 20.9045 )
									ret := -0.177419
								if( ema1 > 20.9045 )
									ret := 0.139344
							if( Negative_Money_Flow_Sum > 2.5118e+07 )
								if( Raw_Money_Flow <= 5.35533e+06 )
									ret := -0.216192
								if( Raw_Money_Flow > 5.35533e+06 )
									ret := -0.007042
					if( Raw_Money_Flow > 1.29455e+07 )
						if( Positive_Money_Flow_Sum <= 2.14635e+07 )
							if( MFI_Low <= 75.3884 )
								if( ema12 <= -0.703436 )
									ret := 0.958333 // buy
								if( ema12 > -0.703436 )
									ret := 0.291667
							if( MFI_Low > 75.3884 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.14635e+07 )
							if( Money_Flow_Ratio <= 0.426679 )
								if( ema13 <= -2.17797 )
									ret := -0.400000
								if( ema13 > -2.17797 )
									ret := -0.769231 // sell
							if( Money_Flow_Ratio > 0.426679 )
								if( ema13 <= -1.36338 )
									ret := -0.272727
								if( ema13 > -1.36338 )
									ret := 0.376344
				if( ema3 > 77.989 )
					if( Raw_Money_Flow <= 517698 )
						if( Raw_Money_Flow <= 67906.5 )
							ret := 0.529412
						if( Raw_Money_Flow > 67906.5 )
							if( Negative_Money_Flow_Sum <= 590296 )
								ret := 0.545455
							if( Negative_Money_Flow_Sum > 590296 )
								if( MFI_High <= -29.4874 )
									ret := 0.025974
								if( MFI_High > -29.4874 )
									ret := -0.354839
					if( Raw_Money_Flow > 517698 )
						if( ema2 <= 86.6951 )
							if( ema12 <= -0.338861 )
								if( tema <= 75.8539 )
									ret := -0.947368 // sell
								if( tema > 75.8539 )
									ret := -0.496855
							if( ema12 > -0.338861 )
								if( Positive_Money_Flow_Sum <= 4.56839e+07 )
									ret := -0.024691
								if( Positive_Money_Flow_Sum > 4.56839e+07 )
									ret := -0.420000
						if( ema2 > 86.6951 )
							if( Positive_Money_Flow <= 9.61843e+06 )
								if( ema12 <= -0.47758 )
									ret := 0.045455
								if( ema12 > -0.47758 )
									ret := -0.478261
							if( Positive_Money_Flow > 9.61843e+06 )
								if( ema12 <= -0.752713 )
									ret := 0.761905 // buy
								if( ema12 > -0.752713 )
									ret := -0.066667
		if( Negative_Money_Flow > 3.96079 )
			if( ema1 <= 1.62978 )
				if( MFI_High <= -40.6638 )
					if( ema12 <= -0.005329 )
						if( ema13 <= -0.012031 )
							if( tema <= 0.657824 )
								if( ema13 <= -0.017715 )
									ret := -1.000000 // sell
								if( ema13 > -0.017715 )
									ret := -0.200000
							if( tema > 0.657824 )
								if( ema13 <= -0.024431 )
									ret := 0.520202
								if( ema13 > -0.024431 )
									ret := 0.209370
						if( ema13 > -0.012031 )
							if( MFI_High <= -72.8956 )
								if( Positive_Money_Flow_Sum <= 23085.4 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 23085.4 )
									ret := 0.692308
							if( MFI_High > -72.8956 )
								if( ema13 <= -0.004215 )
									ret := 0.613757
								if( ema13 > -0.004215 )
									ret := -0.285714
					if( ema12 > -0.005329 )
						if( Positive_Money_Flow_Sum <= 33300.1 )
							if( MFI <= 7.95005 )
								if( Typical_Price <= 1.18996 )
									ret := -0.373626
								if( Typical_Price > 1.18996 )
									ret := 0.218750
							if( MFI > 7.95005 )
								if( Positive_Money_Flow <= 12.2047 )
									ret := 0.356061
								if( Positive_Money_Flow > 12.2047 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 33300.1 )
							if( Typical_Price <= 1.25109 )
								if( Negative_Money_Flow_Sum <= 61665.4 )
									ret := -0.857143 // sell
								if( Negative_Money_Flow_Sum > 61665.4 )
									ret := 0.192308
							if( Typical_Price > 1.25109 )
								if( Negative_Money_Flow_Sum <= 1.11448e+06 )
									ret := -0.239024
								if( Negative_Money_Flow_Sum > 1.11448e+06 )
									ret := 0.909091 // buy
				if( MFI_High > -40.6638 )
					if( Raw_Money_Flow <= 914.908 )
						if( MFI_Low <= 65.9788 )
							if( ema3 <= 1.1171 )
								if( MFI_High <= -13.2642 )
									ret := 0.605263
								if( MFI_High > -13.2642 )
									ret := 0.936937 // buy
							if( ema3 > 1.1171 )
								if( Negative_Money_Flow_Sum <= 98278.4 )
									ret := 0.377049
								if( Negative_Money_Flow_Sum > 98278.4 )
									ret := 0.768293 // buy
						if( MFI_Low > 65.9788 )
							ret := -0.090909
					if( Raw_Money_Flow > 914.908 )
						if( ema12 <= -0.004043 )
							if( ema3 <= 1.28448 )
								if( Negative_Money_Flow <= 1081.98 )
									ret := -0.125000
								if( Negative_Money_Flow > 1081.98 )
									ret := 0.765823 // buy
							if( ema3 > 1.28448 )
								if( MFI <= 61.8591 )
									ret := 0.512821
								if( MFI > 61.8591 )
									ret := -0.040000
						if( ema12 > -0.004043 )
							if( Money_Flow_Ratio <= 2.06867 )
								if( ema13 <= -0.001549 )
									ret := 0.041176
								if( ema13 > -0.001549 )
									ret := 0.371585
							if( Money_Flow_Ratio > 2.06867 )
								if( Typical_Price <= 1.35442 )
									ret := 0.527607
								if( Typical_Price > 1.35442 )
									ret := 0.054054
			if( ema1 > 1.62978 )
				if( Negative_Money_Flow <= 82103.4 )
					if( Positive_Money_Flow_Sum <= 528930 )
						if( Negative_Money_Flow_Sum <= 1.04552e+07 )
							if( MFI <= 1.71699 )
								if( Typical_Price <= 2.97378 )
									ret := 0.320000
								if( Typical_Price > 2.97378 )
									ret := -0.447761
							if( MFI > 1.71699 )
								if( Negative_Money_Flow <= 40499.2 )
									ret := 0.075572
								if( Negative_Money_Flow > 40499.2 )
									ret := 0.201317
						if( Negative_Money_Flow_Sum > 1.04552e+07 )
							if( ema1 <= 36.5783 )
								if( ema3 <= 17.8689 )
									ret := 0.593750
								if( ema3 > 17.8689 )
									ret := 0.979592 // buy
							if( ema1 > 36.5783 )
								if( Negative_Money_Flow_Sum <= 1.8139e+07 )
									ret := -0.307692
								if( Negative_Money_Flow_Sum > 1.8139e+07 )
									ret := 0.506494
					if( Positive_Money_Flow_Sum > 528930 )
						if( Money_Flow_Ratio <= 0.224386 )
							if( ema1 <= 15.5191 )
								if( Positive_Money_Flow_Sum <= 623515 )
									ret := 0.058824
								if( Positive_Money_Flow_Sum > 623515 )
									ret := 0.710204 // buy
							if( ema1 > 15.5191 )
								if( Typical_Price <= 15.6679 )
									ret := -0.666667
								if( Typical_Price > 15.6679 )
									ret := 0.364198
						if( Money_Flow_Ratio > 0.224386 )
							if( MFI <= 81.5751 )
								if( Positive_Money_Flow_Sum <= 8.05086e+07 )
									ret := 0.177593
								if( Positive_Money_Flow_Sum > 8.05086e+07 )
									ret := -0.937500 // sell
							if( MFI > 81.5751 )
								if( ema3 <= 21.1555 )
									ret := 0.218130
								if( ema3 > 21.1555 )
									ret := 0.623431
				if( Negative_Money_Flow > 82103.4 )
					if( ema1 <= 53.0404 )
						if( MFI <= 32.5368 )
							if( Raw_Money_Flow <= 98962.2 )
								if( Negative_Money_Flow_Sum <= 354447 )
									ret := -0.805970 // sell
								if( Negative_Money_Flow_Sum > 354447 )
									ret := 0.033654
							if( Raw_Money_Flow > 98962.2 )
								if( ema12 <= -0.892937 )
									ret := 0.661972
								if( ema12 > -0.892937 )
									ret := 0.082524
						if( MFI > 32.5368 )
							if( MFI <= 38.8495 )
								if( ema3 <= 3.82495 )
									ret := 0.177419
								if( ema3 > 3.82495 )
									ret := -0.126700
							if( MFI > 38.8495 )
								if( Positive_Money_Flow_Sum <= 1.71377e+07 )
									ret := 0.042357
								if( Positive_Money_Flow_Sum > 1.71377e+07 )
									ret := -0.070922
					if( ema1 > 53.0404 )
						if( Raw_Money_Flow <= 4.48566e+07 )
							if( Negative_Money_Flow_Sum <= 8.35707e+07 )
								if( Raw_Money_Flow <= 583979 )
									ret := 0.058104
								if( Raw_Money_Flow > 583979 )
									ret := -0.083963
							if( Negative_Money_Flow_Sum > 8.35707e+07 )
								if( ema2 <= 87.193 )
									ret := -0.299185
								if( ema2 > 87.193 )
									ret := 0.403846
						if( Raw_Money_Flow > 4.48566e+07 )
							if( MFI <= 5.01764 )
								if( ema1 <= 82.1039 )
									ret := 0.769231 // buy
								if( ema1 > 82.1039 )
									ret := 1.000000 // buy
							if( MFI > 5.01764 )
								ret := 0.500000
	if( ema12 > -0.000107 )
		if( MFI <= 35.7201 )
			if( ema2 <= 2.91331 )
				if( Positive_Money_Flow <= 2.44903 )
					if( MFI <= 18.4473 )
						if( Negative_Money_Flow <= 43509.3 )
							if( ema2 <= 0.700541 )
								ret := 0.176471
							if( ema2 > 0.700541 )
								if( ema13 <= 0.013829 )
									ret := -0.397163
								if( ema13 > 0.013829 )
									ret := -0.870968 // sell
						if( Negative_Money_Flow > 43509.3 )
							if( Negative_Money_Flow_Sum <= 472097 )
								if( Typical_Price <= 2.01035 )
									ret := 0.181818
								if( Typical_Price > 2.01035 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 472097 )
								if( MFI_Low <= -17.8335 )
									ret := -0.200000
								if( MFI_Low > -17.8335 )
									ret := 0.750000 // buy
					if( MFI > 18.4473 )
						if( MFI_Low <= 4.01595 )
							if( Positive_Money_Flow_Sum <= 176137 )
								if( ema2 <= 1.10303 )
									ret := 0.586957
								if( ema2 > 1.10303 )
									ret := 0.162500
							if( Positive_Money_Flow_Sum > 176137 )
								ret := -0.916667 // sell
						if( MFI_Low > 4.01595 )
							if( Money_Flow_Ratio <= 0.443722 )
								if( ema12 <= 0.005301 )
									ret := -0.204301
								if( ema12 > 0.005301 )
									ret := -0.615385
							if( Money_Flow_Ratio > 0.443722 )
								if( MFI_Low <= 11.2932 )
									ret := 0.500000
								if( MFI_Low > 11.2932 )
									ret := -0.081448
				if( Positive_Money_Flow > 2.44903 )
					if( Typical_Price <= 0.70237 )
						if( Money_Flow_Ratio <= 0.363867 )
							ret := 0.318182
						if( Money_Flow_Ratio > 0.363867 )
							ret := -0.363636
					if( Typical_Price > 0.70237 )
						if( ema13 <= 0.010295 )
							if( ema1 <= 1.79233 )
								if( Money_Flow_Ratio <= 0.088165 )
									ret := -0.976190 // sell
								if( Money_Flow_Ratio > 0.088165 )
									ret := -0.588353
							if( ema1 > 1.79233 )
								if( Negative_Money_Flow <= 2099.49 )
									ret := -0.326180
								if( Negative_Money_Flow > 2099.49 )
									ret := -0.891892 // sell
						if( ema13 > 0.010295 )
							if( ema12 <= 0.008176 )
								if( ema12 <= 0.007337 )
									ret := -0.743590 // sell
								if( ema12 > 0.007337 )
									ret := -0.083333
							if( ema12 > 0.008176 )
								if( Raw_Money_Flow <= 473.015 )
									ret := -0.500000
								if( Raw_Money_Flow > 473.015 )
									ret := -0.900000 // sell
			if( ema2 > 2.91331 )
				if( Money_Flow_Ratio <= 0.003355 )
					if( Typical_Price <= 13.4299 )
						ret := 0.200000
					if( Typical_Price > 13.4299 )
						if( Negative_Money_Flow_Sum <= 7.26032e+07 )
							ret := 0.727273 // buy
						if( Negative_Money_Flow_Sum > 7.26032e+07 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.003355 )
					if( ema1 <= 9.77837 )
						if( Raw_Money_Flow <= 21968.4 )
							if( MFI_Low <= -7.74186 )
								if( Negative_Money_Flow <= 78.7895 )
									ret := -0.739130 // sell
								if( Negative_Money_Flow > 78.7895 )
									ret := -0.375940
							if( MFI_Low > -7.74186 )
								if( MFI_Low <= -4.26654 )
									ret := 0.614035
								if( MFI_Low > -4.26654 )
									ret := -0.388087
						if( Raw_Money_Flow > 21968.4 )
							if( ema12 <= 0.045419 )
								if( MFI <= 30.9825 )
									ret := -0.119926
								if( MFI > 30.9825 )
									ret := 0.161017
							if( ema12 > 0.045419 )
								if( tema <= 7.82849 )
									ret := -0.925926 // sell
								if( tema > 7.82849 )
									ret := -0.187500
					if( ema1 > 9.77837 )
						if( Negative_Money_Flow <= 2025 )
							if( Positive_Money_Flow_Sum <= 302612 )
								if( MFI_Low <= -18.9935 )
									ret := 0.044444
								if( MFI_Low > -18.9935 )
									ret := -0.526316
							if( Positive_Money_Flow_Sum > 302612 )
								if( ema1 <= 10.3062 )
									ret := 0.900000 // buy
								if( ema1 > 10.3062 )
									ret := -0.204338
						if( Negative_Money_Flow > 2025 )
							if( ema12 <= 0.294354 )
								if( Positive_Money_Flow <= 17659.3 )
									ret := 0.056810
								if( Positive_Money_Flow > 17659.3 )
									ret := -0.456311
							if( ema12 > 0.294354 )
								if( MFI <= 32.1549 )
									ret := -0.595238
								if( MFI > 32.1549 )
									ret := 0.222222
		if( MFI > 35.7201 )
			if( Negative_Money_Flow <= 39.5659 )
				if( Positive_Money_Flow <= 25302.2 )
					if( Money_Flow_Ratio <= 1.74988 )
						if( ema13 <= 0.000551 )
							if( Money_Flow_Ratio <= 0.690931 )
								if( Raw_Money_Flow <= 4768.43 )
									ret := -0.846154 // sell
								if( Raw_Money_Flow > 4768.43 )
									ret := -0.297297
							if( Money_Flow_Ratio > 0.690931 )
								if( Positive_Money_Flow <= 5736.4 )
									ret := -0.233831
								if( Positive_Money_Flow > 5736.4 )
									ret := -0.516667
						if( ema13 > 0.000551 )
							if( ema12 <= 0.005805 )
								if( Positive_Money_Flow_Sum <= 80884.5 )
									ret := -0.236674
								if( Positive_Money_Flow_Sum > 80884.5 )
									ret := 0.062500
							if( ema12 > 0.005805 )
								if( tema <= 10.0844 )
									ret := -0.338735
								if( tema > 10.0844 )
									ret := -0.141274
					if( Money_Flow_Ratio > 1.74988 )
						if( Typical_Price <= 5.495 )
							if( Raw_Money_Flow <= 4583.71 )
								if( Positive_Money_Flow_Sum <= 1.35528e+06 )
									ret := -0.286561
								if( Positive_Money_Flow_Sum > 1.35528e+06 )
									ret := 0.165563
							if( Raw_Money_Flow > 4583.71 )
								if( MFI_High <= 1.7088 )
									ret := 0.178284
								if( MFI_High > 1.7088 )
									ret := -0.174208
						if( Typical_Price > 5.495 )
							if( MFI_High <= -11.2221 )
								if( tema <= 6.65295 )
									ret := -0.750000 // sell
								if( tema > 6.65295 )
									ret := 0.183432
							if( MFI_High > -11.2221 )
								if( Money_Flow_Ratio <= 9.13167 )
									ret := -0.302300
								if( Money_Flow_Ratio > 9.13167 )
									ret := -0.046332
				if( Positive_Money_Flow > 25302.2 )
					if( Raw_Money_Flow <= 6.91577e+06 )
						if( Positive_Money_Flow_Sum <= 1.06828e+08 )
							if( Positive_Money_Flow_Sum <= 46355.1 )
								if( Money_Flow_Ratio <= 2.05279 )
									ret := 0.923077 // buy
								if( Money_Flow_Ratio > 2.05279 )
									ret := 0.916667 // buy
							if( Positive_Money_Flow_Sum > 46355.1 )
								if( Money_Flow_Ratio <= 60.2974 )
									ret := -0.054274
								if( Money_Flow_Ratio > 60.2974 )
									ret := 0.108071
						if( Positive_Money_Flow_Sum > 1.06828e+08 )
							if( MFI_Low <= 51.5401 )
								ret := 0.250000
							if( MFI_Low > 51.5401 )
								if( MFI_Low <= 53.7596 )
									ret := -1.000000 // sell
								if( MFI_Low > 53.7596 )
									ret := -0.565789
					if( Raw_Money_Flow > 6.91577e+06 )
						if( MFI_Low <= 46.8181 )
							if( ema13 <= 0.23004 )
								if( Negative_Money_Flow_Sum <= 2.31539e+07 )
									ret := -0.344086
								if( Negative_Money_Flow_Sum > 2.31539e+07 )
									ret := 0.277372
							if( ema13 > 0.23004 )
								if( Negative_Money_Flow_Sum <= 7.13243e+07 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 7.13243e+07 )
									ret := 0.684211
						if( MFI_Low > 46.8181 )
							if( ema3 <= 84.8143 )
								if( Negative_Money_Flow_Sum <= 235304 )
									ret := 0.317073
								if( Negative_Money_Flow_Sum > 235304 )
									ret := -0.020088
							if( ema3 > 84.8143 )
								if( Raw_Money_Flow <= 4.47572e+07 )
									ret := -0.329114
								if( Raw_Money_Flow > 4.47572e+07 )
									ret := -0.961538 // sell
			if( Negative_Money_Flow > 39.5659 )
				if( ema12 <= 0.006283 )
					if( MFI_High <= -13.8704 )
						if( tema <= 0.681725 )
							if( ema3 <= 0.620532 )
								ret := 1.000000 // buy
							if( ema3 > 0.620532 )
								ret := 0.875000 // buy
						if( tema > 0.681725 )
							if( Typical_Price <= 0.810361 )
								if( Negative_Money_Flow_Sum <= 79937.5 )
									ret := -0.542553
								if( Negative_Money_Flow_Sum > 79937.5 )
									ret := 0.625000
							if( Typical_Price > 0.810361 )
								if( Negative_Money_Flow <= 29922.6 )
									ret := 0.108999
								if( Negative_Money_Flow > 29922.6 )
									ret := -0.029012
					if( MFI_High > -13.8704 )
						if( Negative_Money_Flow <= 235469 )
							if( Negative_Money_Flow_Sum <= 3958.08 )
								if( Negative_Money_Flow <= 415.987 )
									ret := 0.909091 // buy
								if( Negative_Money_Flow > 415.987 )
									ret := 0.538462
							if( Negative_Money_Flow_Sum > 3958.08 )
								if( MFI_High <= 18.6584 )
									ret := 0.273408
								if( MFI_High > 18.6584 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow > 235469 )
							if( Raw_Money_Flow <= 453401 )
								ret := -0.736842 // sell
							if( Raw_Money_Flow > 453401 )
								ret := -0.111111
				if( ema12 > 0.006283 )
					if( MFI <= 67.6507 )
						if( ema1 <= 76.9801 )
							if( tema <= 48.7926 )
								if( Positive_Money_Flow <= 123.817 )
									ret := -0.015082
								if( Positive_Money_Flow > 123.817 )
									ret := -0.195502
							if( tema > 48.7926 )
								if( Negative_Money_Flow <= 2.90038e+06 )
									ret := 0.003254
								if( Negative_Money_Flow > 2.90038e+06 )
									ret := 0.196486
						if( ema1 > 76.9801 )
							if( Money_Flow_Ratio <= 1.89863 )
								if( Positive_Money_Flow_Sum <= 886176 )
									ret := 0.255814
								if( Positive_Money_Flow_Sum > 886176 )
									ret := -0.339552
							if( Money_Flow_Ratio > 1.89863 )
								if( tema <= 81.6574 )
									ret := -0.956522 // sell
								if( tema > 81.6574 )
									ret := -0.600000
					if( MFI > 67.6507 )
						if( Typical_Price <= 7.33726 )
							if( Raw_Money_Flow <= 533.208 )
								if( Positive_Money_Flow_Sum <= 76368.7 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 76368.7 )
									ret := -0.181818
							if( Raw_Money_Flow > 533.208 )
								if( Negative_Money_Flow <= 228.191 )
									ret := 0.437500
								if( Negative_Money_Flow > 228.191 )
									ret := -0.013820
						if( Typical_Price > 7.33726 )
							if( Positive_Money_Flow_Sum <= 859582 )
								if( Money_Flow_Ratio <= 3.8913 )
									ret := -0.326733
								if( Money_Flow_Ratio > 3.8913 )
									ret := 0.200000
							if( Positive_Money_Flow_Sum > 859582 )
								if( Raw_Money_Flow <= 180477 )
									ret := 0.209497
								if( Raw_Money_Flow > 180477 )
									ret := 0.062174
	
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
float op_operation = decision_tree_0_APPS_15Min_91eb5391(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


