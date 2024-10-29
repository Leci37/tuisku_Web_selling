//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: CRWD_15Min_2MT0_94b10541 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2MT0_94b10541", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_94b10541(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.027887 )
		if( Raw_Money_Flow <= 944577 )
			if( Negative_Money_Flow <= 87.2868 )
				if( MFI <= 37.8705 )
					if( ema12 <= 0.004561 )
						if( Negative_Money_Flow_Sum <= 5.71937e+08 )
							if( Negative_Money_Flow_Sum <= 845211 )
								if( Positive_Money_Flow <= 32254.1 )
									ret := -0.705882 // sell
								if( Positive_Money_Flow > 32254.1 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 845211 )
								if( Negative_Money_Flow_Sum <= 900622 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 900622 )
									ret := 0.003294
						if( Negative_Money_Flow_Sum > 5.71937e+08 )
							if( Negative_Money_Flow_Sum <= 6.55563e+08 )
								if( ema12 <= -0.598971 )
									ret := 0.750000 // buy
								if( ema12 > -0.598971 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 6.55563e+08 )
								if( ema12 <= -1.05845 )
									ret := 0.250000
								if( ema12 > -1.05845 )
									ret := 0.000000
					if( ema12 > 0.004561 )
						if( Negative_Money_Flow_Sum <= 1.69706e+06 )
							if( ema13 <= 0.019136 )
								ret := -1.000000 // sell
							if( ema13 > 0.019136 )
								ret := -0.500000
						if( Negative_Money_Flow_Sum > 1.69706e+06 )
							if( ema13 <= -0.043227 )
								if( ema12 <= 0.020736 )
									ret := -0.517241
								if( ema12 > 0.020736 )
									ret := -0.083333
							if( ema13 > -0.043227 )
								if( ema12 <= 0.022847 )
									ret := -0.072727
								if( ema12 > 0.022847 )
									ret := 0.333333
				if( MFI > 37.8705 )
					if( Positive_Money_Flow_Sum <= 4.92734e+07 )
						if( Negative_Money_Flow_Sum <= 408230 )
							if( ema12 <= -0.223859 )
								if( Positive_Money_Flow_Sum <= 818489 )
									ret := 0.652174
								if( Positive_Money_Flow_Sum > 818489 )
									ret := -0.200000
							if( ema12 > -0.223859 )
								if( Raw_Money_Flow <= 10132.6 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 10132.6 )
									ret := -0.394231
						if( Negative_Money_Flow_Sum > 408230 )
							if( Raw_Money_Flow <= 318281 )
								if( ema3 <= 254.174 )
									ret := 0.372380
								if( ema3 > 254.174 )
									ret := -0.047619
							if( Raw_Money_Flow > 318281 )
								if( Positive_Money_Flow_Sum <= 2.65931e+06 )
									ret := 0.200730
								if( Positive_Money_Flow_Sum > 2.65931e+06 )
									ret := -0.125828
					if( Positive_Money_Flow_Sum > 4.92734e+07 )
						if( Negative_Money_Flow_Sum <= 2.46402e+07 )
							if( ema12 <= -0.428862 )
								if( ema3 <= 152.454 )
									ret := -0.461538
								if( ema3 > 152.454 )
									ret := 0.361111
							if( ema12 > -0.428862 )
								if( MFI_High <= 19.8306 )
									ret := -0.360294
								if( MFI_High > 19.8306 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.46402e+07 )
							if( Positive_Money_Flow <= 267274 )
								if( Typical_Price <= 49.15 )
									ret := -0.600000
								if( Typical_Price > 49.15 )
									ret := 0.105826
							if( Positive_Money_Flow > 267274 )
								if( ema1 <= 176.854 )
									ret := 0.174603
								if( ema1 > 176.854 )
									ret := -0.276923
			if( Negative_Money_Flow > 87.2868 )
				if( ema2 <= 107.386 )
					if( MFI_Low <= 20.8017 )
						if( Positive_Money_Flow_Sum <= 2.10256e+06 )
							if( ema12 <= -0.076061 )
								if( Negative_Money_Flow <= 128120 )
									ret := 0.647059
								if( Negative_Money_Flow > 128120 )
									ret := 0.339130
							if( ema12 > -0.076061 )
								if( Typical_Price <= 57.1175 )
									ret := 0.689655
								if( Typical_Price > 57.1175 )
									ret := -0.114943
						if( Positive_Money_Flow_Sum > 2.10256e+06 )
							if( ema12 <= -0.536037 )
								if( Negative_Money_Flow_Sum <= 2.96909e+07 )
									ret := -0.055556
								if( Negative_Money_Flow_Sum > 2.96909e+07 )
									ret := 0.586207
							if( ema12 > -0.536037 )
								if( Positive_Money_Flow <= 918.547 )
									ret := 0.141414
								if( Positive_Money_Flow > 918.547 )
									ret := -0.155556
					if( MFI_Low > 20.8017 )
						if( Positive_Money_Flow_Sum <= 3.17514e+07 )
							if( ema1 <= 94.1297 )
								if( ema12 <= -0.18341 )
									ret := 0.777070 // buy
								if( ema12 > -0.18341 )
									ret := 0.468165
							if( ema1 > 94.1297 )
								if( Negative_Money_Flow_Sum <= 2.12753e+06 )
									ret := 0.293333
								if( Negative_Money_Flow_Sum > 2.12753e+06 )
									ret := -0.380952
						if( Positive_Money_Flow_Sum > 3.17514e+07 )
							if( ema1 <= 56.0041 )
								if( MFI_Low <= 65.576 )
									ret := -0.471698
								if( MFI_Low > 65.576 )
									ret := 0.285714
							if( ema1 > 56.0041 )
								if( ema12 <= -0.253923 )
									ret := 0.117647
								if( ema12 > -0.253923 )
									ret := 0.429603
				if( ema2 > 107.386 )
					if( Money_Flow_Ratio <= 0.956079 )
						if( Positive_Money_Flow_Sum <= 1.2044e+06 )
							if( ema12 <= -0.509945 )
								if( Negative_Money_Flow_Sum <= 2.64003e+08 )
									ret := 0.338936
								if( Negative_Money_Flow_Sum > 2.64003e+08 )
									ret := -0.368421
							if( ema12 > -0.509945 )
								if( Positive_Money_Flow_Sum <= 908474 )
									ret := 0.110108
								if( Positive_Money_Flow_Sum > 908474 )
									ret := -0.270833
						if( Positive_Money_Flow_Sum > 1.2044e+06 )
							if( Positive_Money_Flow_Sum <= 2.91677e+06 )
								if( Positive_Money_Flow_Sum <= 2.0646e+06 )
									ret := 0.332308
								if( Positive_Money_Flow_Sum > 2.0646e+06 )
									ret := 0.696552
							if( Positive_Money_Flow_Sum > 2.91677e+06 )
								if( ema1 <= 161.036 )
									ret := 0.343124
								if( ema1 > 161.036 )
									ret := 0.178404
					if( Money_Flow_Ratio > 0.956079 )
						if( Negative_Money_Flow_Sum <= 869299 )
							if( ema12 <= -0.159187 )
								if( ema3 <= 124.307 )
									ret := 0.120000
								if( ema3 > 124.307 )
									ret := 0.582278
							if( ema12 > -0.159187 )
								if( Negative_Money_Flow <= 50780.7 )
									ret := 0.313725
								if( Negative_Money_Flow > 50780.7 )
									ret := -0.166667
						if( Negative_Money_Flow_Sum > 869299 )
							if( Negative_Money_Flow_Sum <= 1.20356e+06 )
								if( Raw_Money_Flow <= 112660 )
									ret := 0.170213
								if( Raw_Money_Flow > 112660 )
									ret := -0.459184
							if( Negative_Money_Flow_Sum > 1.20356e+06 )
								if( Positive_Money_Flow_Sum <= 2.28292e+06 )
									ret := 0.485149
								if( Positive_Money_Flow_Sum > 2.28292e+06 )
									ret := 0.079659
		if( Raw_Money_Flow > 944577 )
			if( ema2 <= 149.273 )
				if( MFI_High <= -48.1198 )
					if( Negative_Money_Flow_Sum <= 2.38421e+07 )
						if( Negative_Money_Flow_Sum <= 1.25682e+07 )
							if( Negative_Money_Flow_Sum <= 3.9977e+06 )
								if( Negative_Money_Flow <= 1.00339e+06 )
									ret := -0.400000
								if( Negative_Money_Flow > 1.00339e+06 )
									ret := 0.903226 // buy
							if( Negative_Money_Flow_Sum > 3.9977e+06 )
								if( ema12 <= -0.65473 )
									ret := 0.500000
								if( ema12 > -0.65473 )
									ret := -0.477612
						if( Negative_Money_Flow_Sum > 1.25682e+07 )
							if( Negative_Money_Flow <= 4.03169e+06 )
								if( Raw_Money_Flow <= 1.58371e+06 )
									ret := -0.041667
								if( Raw_Money_Flow > 1.58371e+06 )
									ret := 0.640000
							if( Negative_Money_Flow > 4.03169e+06 )
								if( Positive_Money_Flow_Sum <= 411171 )
									ret := 0.296296
								if( Positive_Money_Flow_Sum > 411171 )
									ret := 0.863158 // buy
					if( Negative_Money_Flow_Sum > 2.38421e+07 )
						if( Positive_Money_Flow_Sum <= 7.59414e+06 )
							if( Raw_Money_Flow <= 1.39188e+07 )
								if( Negative_Money_Flow_Sum <= 6.55239e+07 )
									ret := -0.490421
								if( Negative_Money_Flow_Sum > 6.55239e+07 )
									ret := 0.152941
							if( Raw_Money_Flow > 1.39188e+07 )
								if( ema13 <= -0.664801 )
									ret := -0.047771
								if( ema13 > -0.664801 )
									ret := 0.335616
						if( Positive_Money_Flow_Sum > 7.59414e+06 )
							if( ema3 <= 128.431 )
								if( ema12 <= -0.338864 )
									ret := 0.302201
								if( ema12 > -0.338864 )
									ret := 0.088997
							if( ema3 > 128.431 )
								if( MFI_Low <= -9.26627 )
									ret := 0.409091
								if( MFI_Low > -9.26627 )
									ret := 0.018950
				if( MFI_High > -48.1198 )
					if( MFI <= 38.1753 )
						if( Positive_Money_Flow <= 7.90801e+06 )
							if( ema13 <= -2.57853 )
								if( ema12 <= -1.60039 )
									ret := -0.950000 // sell
								if( ema12 > -1.60039 )
									ret := -0.250000
							if( ema13 > -2.57853 )
								if( ema12 <= -0.367949 )
									ret := 0.057279
								if( ema12 > -0.367949 )
									ret := -0.210863
						if( Positive_Money_Flow > 7.90801e+06 )
							if( ema2 <= 57.1796 )
								if( Positive_Money_Flow <= 1.34184e+07 )
									ret := 0.928571 // buy
								if( Positive_Money_Flow > 1.34184e+07 )
									ret := 0.200000
							if( ema2 > 57.1796 )
								if( Positive_Money_Flow <= 2.38568e+07 )
									ret := 0.086142
								if( Positive_Money_Flow > 2.38568e+07 )
									ret := 0.480000
					if( MFI > 38.1753 )
						if( Negative_Money_Flow_Sum <= 4.16441e+08 )
							if( MFI_High <= 15.5186 )
								if( Negative_Money_Flow_Sum <= 2.55226e+08 )
									ret := 0.090210
								if( Negative_Money_Flow_Sum > 2.55226e+08 )
									ret := -0.296703
							if( MFI_High > 15.5186 )
								if( Raw_Money_Flow <= 2.00535e+07 )
									ret := -0.625000
								if( Raw_Money_Flow > 2.00535e+07 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 4.16441e+08 )
							if( Raw_Money_Flow <= 2.24415e+08 )
								if( Negative_Money_Flow_Sum <= 8.49314e+08 )
									ret := 0.829787 // buy
								if( Negative_Money_Flow_Sum > 8.49314e+08 )
									ret := 0.400000
							if( Raw_Money_Flow > 2.24415e+08 )
								ret := -0.500000
			if( ema2 > 149.273 )
				if( Positive_Money_Flow_Sum <= 1.09697e+09 )
					if( Positive_Money_Flow_Sum <= 7.51093e+08 )
						if( Negative_Money_Flow_Sum <= 1.22283e+06 )
							if( tema <= 243.846 )
								if( Raw_Money_Flow <= 1.99352e+06 )
									ret := -0.666667
								if( Raw_Money_Flow > 1.99352e+06 )
									ret := -0.292683
							if( tema > 243.846 )
								ret := 0.285714
						if( Negative_Money_Flow_Sum > 1.22283e+06 )
							if( Negative_Money_Flow_Sum <= 4.43914e+06 )
								if( MFI_Low <= 13.6745 )
									ret := 0.470000
								if( MFI_Low > 13.6745 )
									ret := 0.130000
							if( Negative_Money_Flow_Sum > 4.43914e+06 )
								if( MFI <= 0.289178 )
									ret := -0.400000
								if( MFI > 0.289178 )
									ret := 0.009650
					if( Positive_Money_Flow_Sum > 7.51093e+08 )
						if( MFI_Low <= 47.7822 )
							if( Negative_Money_Flow <= 6.26995e+06 )
								if( Negative_Money_Flow_Sum <= 1.70976e+09 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 1.70976e+09 )
									ret := 0.928571 // buy
							if( Negative_Money_Flow > 6.26995e+06 )
								if( Negative_Money_Flow <= 1.41462e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1.41462e+08 )
									ret := 0.692308
						if( MFI_Low > 47.7822 )
							if( ema12 <= -0.222138 )
								if( tema <= 213.271 )
									ret := -1.000000 // sell
								if( tema > 213.271 )
									ret := -0.750000 // sell
							if( ema12 > -0.222138 )
								ret := 0.000000
				if( Positive_Money_Flow_Sum > 1.09697e+09 )
					if( tema <= 266.391 )
						if( Raw_Money_Flow <= 2.2524e+08 )
							ret := -0.142857
						if( Raw_Money_Flow > 2.2524e+08 )
							if( Typical_Price <= 264.034 )
								ret := 0.500000
							if( Typical_Price > 264.034 )
								ret := 0.000000
					if( tema > 266.391 )
						if( Negative_Money_Flow <= 1.96696e+08 )
							if( Positive_Money_Flow_Sum <= 1.22018e+09 )
								if( tema <= 329.91 )
									ret := -0.250000
								if( tema > 329.91 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 1.22018e+09 )
								if( MFI_High <= -29.2768 )
									ret := -1.000000 // sell
								if( MFI_High > -29.2768 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow > 1.96696e+08 )
							ret := 0.000000
	if( ema12 > 0.027887 )
		if( Negative_Money_Flow_Sum <= 1.32677e+06 )
			if( Positive_Money_Flow_Sum <= 4.36629e+06 )
				if( MFI_High <= -13.3673 )
					if( Negative_Money_Flow_Sum <= 886442 )
						if( Raw_Money_Flow <= 63973.4 )
							if( MFI_Low <= 32.6988 )
								if( Negative_Money_Flow_Sum <= 385758 )
									ret := -0.731707 // sell
								if( Negative_Money_Flow_Sum > 385758 )
									ret := -0.106667
							if( MFI_Low > 32.6988 )
								if( ema12 <= 0.05618 )
									ret := 0.769231 // buy
								if( ema12 > 0.05618 )
									ret := -0.067961
						if( Raw_Money_Flow > 63973.4 )
							if( ema3 <= 57.9737 )
								if( ema12 <= 0.068134 )
									ret := 0.166667
								if( ema12 > 0.068134 )
									ret := 0.702703 // buy
							if( ema3 > 57.9737 )
								if( Negative_Money_Flow <= 431255 )
									ret := 0.209596
								if( Negative_Money_Flow > 431255 )
									ret := -0.761905 // sell
					if( Negative_Money_Flow_Sum > 886442 )
						if( Money_Flow_Ratio <= 1.2389 )
							if( Positive_Money_Flow_Sum <= 429605 )
								if( Positive_Money_Flow <= 1337.31 )
									ret := -0.380952
								if( Positive_Money_Flow > 1337.31 )
									ret := -0.909091 // sell
							if( Positive_Money_Flow_Sum > 429605 )
								if( MFI <= 42.9109 )
									ret := 0.194444
								if( MFI > 42.9109 )
									ret := -0.162338
						if( Money_Flow_Ratio > 1.2389 )
							if( Raw_Money_Flow <= 603131 )
								if( Positive_Money_Flow <= 507699 )
									ret := -0.556818
								if( Positive_Money_Flow > 507699 )
									ret := 0.500000
							if( Raw_Money_Flow > 603131 )
								if( Typical_Price <= 146.838 )
									ret := -0.454545
								if( Typical_Price > 146.838 )
									ret := 0.312500
				if( MFI_High > -13.3673 )
					if( ema13 <= 2.21692 )
						if( ema3 <= 36.8766 )
							ret := 1.000000 // buy
						if( ema3 > 36.8766 )
							if( tema <= 116.043 )
								if( ema13 <= 0.743942 )
									ret := -0.344371
								if( ema13 > 0.743942 )
									ret := -0.756410 // sell
							if( tema > 116.043 )
								if( MFI_Low <= 51.2317 )
									ret := -0.464115
								if( MFI_Low > 51.2317 )
									ret := -0.161512
					if( ema13 > 2.21692 )
						if( ema2 <= 133.873 )
							if( Raw_Money_Flow <= 323039 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 323039 )
								ret := -0.250000
						if( ema2 > 133.873 )
							if( Positive_Money_Flow_Sum <= 3.69235e+06 )
								if( ema3 <= 159.234 )
									ret := 0.684211
								if( ema3 > 159.234 )
									ret := -0.322581
							if( Positive_Money_Flow_Sum > 3.69235e+06 )
								if( Raw_Money_Flow <= 466941 )
									ret := -0.166667
								if( Raw_Money_Flow > 466941 )
									ret := 0.863636 // buy
			if( Positive_Money_Flow_Sum > 4.36629e+06 )
				if( MFI_High <= 10.9775 )
					if( Typical_Price <= 195.331 )
						if( Positive_Money_Flow <= 1.34726e+06 )
							if( Typical_Price <= 60.5552 )
								if( ema12 <= 0.183556 )
									ret := 0.600000
								if( ema12 > 0.183556 )
									ret := 0.000000
							if( Typical_Price > 60.5552 )
								if( Money_Flow_Ratio <= 4.30985 )
									ret := 0.428571
								if( Money_Flow_Ratio > 4.30985 )
									ret := 0.873016 // buy
						if( Positive_Money_Flow > 1.34726e+06 )
							if( ema13 <= 0.912078 )
								if( Money_Flow_Ratio <= 8.62511 )
									ret := 0.500000
								if( Money_Flow_Ratio > 8.62511 )
									ret := 1.000000 // buy
							if( ema13 > 0.912078 )
								ret := -0.166667
					if( Typical_Price > 195.331 )
						if( Negative_Money_Flow_Sum <= 943586 )
							if( ema1 <= 309.618 )
								if( Positive_Money_Flow_Sum <= 5.54053e+06 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 5.54053e+06 )
									ret := -1.000000 // sell
							if( ema1 > 309.618 )
								ret := -0.250000
						if( Negative_Money_Flow_Sum > 943586 )
							if( Positive_Money_Flow_Sum <= 6.70795e+06 )
								if( ema12 <= 0.788485 )
									ret := 0.000000
								if( ema12 > 0.788485 )
									ret := -0.545455
							if( Positive_Money_Flow_Sum > 6.70795e+06 )
								if( Positive_Money_Flow <= 1.48438e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.48438e+06 )
									ret := 0.750000 // buy
				if( MFI_High > 10.9775 )
					if( Typical_Price <= 148.674 )
						if( ema13 <= 0.278537 )
							if( Raw_Money_Flow <= 1.99348e+07 )
								if( Negative_Money_Flow <= 4692.73 )
									ret := -0.483516
								if( Negative_Money_Flow > 4692.73 )
									ret := 0.122449
							if( Raw_Money_Flow > 1.99348e+07 )
								if( Positive_Money_Flow <= 4.90714e+07 )
									ret := 0.416667
								if( Positive_Money_Flow > 4.90714e+07 )
									ret := -0.800000 // sell
						if( ema13 > 0.278537 )
							if( Positive_Money_Flow_Sum <= 5.67182e+07 )
								if( Positive_Money_Flow_Sum <= 2.57382e+07 )
									ret := -0.117021
								if( Positive_Money_Flow_Sum > 2.57382e+07 )
									ret := 0.395455
							if( Positive_Money_Flow_Sum > 5.67182e+07 )
								if( Negative_Money_Flow <= 25566.8 )
									ret := -0.076305
								if( Negative_Money_Flow > 25566.8 )
									ret := 0.414634
					if( Typical_Price > 148.674 )
						if( Positive_Money_Flow_Sum <= 1.13701e+08 )
							if( Positive_Money_Flow <= 4.93207e+07 )
								if( Money_Flow_Ratio <= 130.061 )
									ret := -0.062257
								if( Money_Flow_Ratio > 130.061 )
									ret := -0.477477
							if( Positive_Money_Flow > 4.93207e+07 )
								if( ema12 <= 0.147365 )
									ret := 0.500000
								if( ema12 > 0.147365 )
									ret := -0.769231 // sell
						if( Positive_Money_Flow_Sum > 1.13701e+08 )
							if( ema2 <= 162.84 )
								if( MFI <= 99.3144 )
									ret := 0.400000
								if( MFI > 99.3144 )
									ret := -0.486486
							if( ema2 > 162.84 )
								if( Positive_Money_Flow_Sum <= 2.58562e+08 )
									ret := 0.113821
								if( Positive_Money_Flow_Sum > 2.58562e+08 )
									ret := -0.197802
		if( Negative_Money_Flow_Sum > 1.32677e+06 )
			if( MFI_High <= -24.4575 )
				if( Negative_Money_Flow_Sum <= 6.8384e+08 )
					if( Positive_Money_Flow_Sum <= 2.50257e+08 )
						if( Typical_Price <= 47.0583 )
							if( tema <= 35.5349 )
								if( Typical_Price <= 34.3602 )
									ret := 0.500000
								if( Typical_Price > 34.3602 )
									ret := -1.000000 // sell
							if( tema > 35.5349 )
								if( tema <= 39.2019 )
									ret := 0.600000
								if( tema > 39.2019 )
									ret := 1.000000 // buy
						if( Typical_Price > 47.0583 )
							if( ema2 <= 304.819 )
								if( Negative_Money_Flow <= 6.56094e+06 )
									ret := -0.040656
								if( Negative_Money_Flow > 6.56094e+06 )
									ret := 0.047738
							if( ema2 > 304.819 )
								if( Negative_Money_Flow_Sum <= 1.27416e+08 )
									ret := -0.365772
								if( Negative_Money_Flow_Sum > 1.27416e+08 )
									ret := -0.024823
					if( Positive_Money_Flow_Sum > 2.50257e+08 )
						if( MFI <= 48.7388 )
							if( ema12 <= 0.550192 )
								if( Typical_Price <= 254.574 )
									ret := 0.350000
								if( Typical_Price > 254.574 )
									ret := -0.259259
							if( ema12 > 0.550192 )
								if( tema <= 310.421 )
									ret := -0.605263
								if( tema > 310.421 )
									ret := 0.000000
						if( MFI > 48.7388 )
							if( ema2 <= 209.72 )
								if( Positive_Money_Flow <= 1.33608e+08 )
									ret := 0.555556
								if( Positive_Money_Flow > 1.33608e+08 )
									ret := -0.750000 // sell
							if( ema2 > 209.72 )
								if( Typical_Price <= 218.883 )
									ret := -0.500000
								if( Typical_Price > 218.883 )
									ret := 0.230769
				if( Negative_Money_Flow_Sum > 6.8384e+08 )
					if( Positive_Money_Flow <= 1.10493e+08 )
						if( Positive_Money_Flow <= 1.76761e+06 )
							if( Negative_Money_Flow <= 1.90223e+08 )
								if( MFI_Low <= -3.90778 )
									ret := -0.500000
								if( MFI_Low > -3.90778 )
									ret := -0.181818
							if( Negative_Money_Flow > 1.90223e+08 )
								if( Negative_Money_Flow <= 2.30419e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.30419e+08 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow > 1.76761e+06 )
							if( MFI_Low <= 24.6048 )
								if( ema2 <= 202.854 )
									ret := -0.750000 // sell
								if( ema2 > 202.854 )
									ret := 0.000000
							if( MFI_Low > 24.6048 )
								if( ema3 <= 289.514 )
									ret := -0.960000 // sell
								if( ema3 > 289.514 )
									ret := -0.625000
					if( Positive_Money_Flow > 1.10493e+08 )
						if( Positive_Money_Flow_Sum <= 6.40916e+08 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.40916e+08 )
							ret := -0.142857
			if( MFI_High > -24.4575 )
				if( Raw_Money_Flow <= 8.46284e+06 )
					if( Raw_Money_Flow <= 67474.9 )
						if( tema <= 55.374 )
							if( ema13 <= 0.114461 )
								if( MFI_High <= -0.610403 )
									ret := -0.184211
								if( MFI_High > -0.610403 )
									ret := 0.750000 // buy
							if( ema13 > 0.114461 )
								if( Positive_Money_Flow_Sum <= 7.10891e+07 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 7.10891e+07 )
									ret := 0.125000
						if( tema > 55.374 )
							if( Negative_Money_Flow <= 4856.13 )
								if( Negative_Money_Flow_Sum <= 8.98215e+07 )
									ret := -0.018321
								if( Negative_Money_Flow_Sum > 8.98215e+07 )
									ret := -0.283019
							if( Negative_Money_Flow > 4856.13 )
								if( ema12 <= 0.134363 )
									ret := 0.346154
								if( ema12 > 0.134363 )
									ret := 0.045817
					if( Raw_Money_Flow > 67474.9 )
						if( Typical_Price <= 175.097 )
							if( ema1 <= 115.216 )
								if( ema12 <= 1.85333 )
									ret := 0.108421
								if( ema12 > 1.85333 )
									ret := 0.904762 // buy
							if( ema1 > 115.216 )
								if( MFI_High <= -21.0137 )
									ret := 0.020513
								if( MFI_High > -21.0137 )
									ret := 0.274468
						if( Typical_Price > 175.097 )
							if( Negative_Money_Flow_Sum <= 1.60877e+06 )
								if( Negative_Money_Flow_Sum <= 1.4153e+06 )
									ret := -0.017241
								if( Negative_Money_Flow_Sum > 1.4153e+06 )
									ret := 0.419355
							if( Negative_Money_Flow_Sum > 1.60877e+06 )
								if( ema2 <= 213.764 )
									ret := -0.053347
								if( ema2 > 213.764 )
									ret := 0.076638
				if( Raw_Money_Flow > 8.46284e+06 )
					if( tema <= 53.3385 )
						if( ema13 <= 0.541757 )
							if( MFI_High <= -6.29359 )
								if( Negative_Money_Flow <= 8.95398e+06 )
									ret := -0.666667
								if( Negative_Money_Flow > 8.95398e+06 )
									ret := 0.125000
							if( MFI_High > -6.29359 )
								if( ema3 <= 47.6483 )
									ret := -0.625000
								if( ema3 > 47.6483 )
									ret := -1.000000 // sell
						if( ema13 > 0.541757 )
							if( ema13 <= 1.14812 )
								if( Typical_Price <= 51.0808 )
									ret := 0.086957
								if( Typical_Price > 51.0808 )
									ret := -0.571429
							if( ema13 > 1.14812 )
								if( ema2 <= 50.0105 )
									ret := -0.764706 // sell
								if( ema2 > 50.0105 )
									ret := 0.000000
					if( tema > 53.3385 )
						if( Positive_Money_Flow_Sum <= 3.6487e+09 )
							if( Negative_Money_Flow_Sum <= 7.17127e+07 )
								if( Positive_Money_Flow_Sum <= 4.75981e+08 )
									ret := 0.000966
								if( Positive_Money_Flow_Sum > 4.75981e+08 )
									ret := -0.298507
							if( Negative_Money_Flow_Sum > 7.17127e+07 )
								if( Positive_Money_Flow_Sum <= 1.41809e+09 )
									ret := 0.060623
								if( Positive_Money_Flow_Sum > 1.41809e+09 )
									ret := 0.487500
						if( Positive_Money_Flow_Sum > 3.6487e+09 )
							if( MFI_High <= -0.922335 )
								ret := -1.000000 // sell
							if( MFI_High > -0.922335 )
								if( ema13 <= 4.40492 )
									ret := 0.500000
								if( ema13 > 4.40492 )
									ret := -0.857143 // sell
	
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
float op_operation = decision_tree_0_CRWD_15Min_94b10541(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


