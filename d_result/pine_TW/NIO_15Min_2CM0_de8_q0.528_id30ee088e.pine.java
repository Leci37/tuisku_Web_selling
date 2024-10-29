//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: NIO_15Min_2CM0_30ee088e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_15Min_2CM0_30ee088e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_15Min_30ee088e(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Typical_Price <= 3.41467 )
		if( Negative_Money_Flow_Sum <= 498212 )
			if( Positive_Money_Flow <= 0.197244 )
				if( Negative_Money_Flow_Sum <= 377102 )
					if( ad <= 10117.1 )
						if( ad_mf <= 0.345694 )
							if( MFI_High <= -24.3722 )
								if( MFI <= 35.5614 )
									ret := 0.205479
								if( MFI > 35.5614 )
									ret := 0.441237
							if( MFI_High > -24.3722 )
								if( MFI_High <= -22.0729 )
									ret := -0.287671
								if( MFI_High > -22.0729 )
									ret := 0.251485
						if( ad_mf > 0.345694 )
							if( ad_mf <= 798.448 )
								if( MFI_High <= -7.78754 )
									ret := -0.439252
								if( MFI_High > -7.78754 )
									ret := 0.312500
							if( ad_mf > 798.448 )
								if( mf <= 0.293113 )
									ret := 0.315271
								if( mf > 0.293113 )
									ret := -0.255814
					if( ad > 10117.1 )
						if( Negative_Money_Flow <= 89542.2 )
							if( mf <= 0.368062 )
								if( Money_Flow_Ratio <= 1.87423 )
									ret := -0.552941
								if( Money_Flow_Ratio > 1.87423 )
									ret := 0.500000
							if( mf > 0.368062 )
								if( MFI <= 68.2001 )
									ret := -0.545455
								if( MFI > 68.2001 )
									ret := -0.960000 // sell
						if( Negative_Money_Flow > 89542.2 )
							if( ad_mf <= 58208.4 )
								if( mf <= 0.046583 )
									ret := 0.692308
								if( mf > 0.046583 )
									ret := -0.464286
							if( ad_mf > 58208.4 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 377102 )
					if( Positive_Money_Flow_Sum <= 633597 )
						if( Raw_Money_Flow <= 25097.4 )
							ret := -0.153846
						if( Raw_Money_Flow > 25097.4 )
							if( Money_Flow_Ratio <= 0.370336 )
								if( Raw_Money_Flow <= 53959.6 )
									ret := -0.850000 // sell
								if( Raw_Money_Flow > 53959.6 )
									ret := -0.275000
							if( Money_Flow_Ratio > 0.370336 )
								if( ad_mf <= -8440.47 )
									ret := -0.909091 // sell
								if( ad_mf > -8440.47 )
									ret := -0.684211
					if( Positive_Money_Flow_Sum > 633597 )
						if( Negative_Money_Flow <= 133552 )
							ret := 0.727273 // buy
						if( Negative_Money_Flow > 133552 )
							ret := -0.142857
			if( Positive_Money_Flow > 0.197244 )
				if( Raw_Money_Flow <= 1757.28 )
					if( Negative_Money_Flow_Sum <= 107161 )
						if( ad_mf <= -1.24904 )
							ret := 0.250000
						if( ad_mf > -1.24904 )
							if( Negative_Money_Flow_Sum <= 73976.1 )
								if( ad_mf <= 0.401297 )
									ret := -0.823529 // sell
								if( ad_mf > 0.401297 )
									ret := -0.978261 // sell
							if( Negative_Money_Flow_Sum > 73976.1 )
								if( Typical_Price <= 2.86684 )
									ret := -0.833333 // sell
								if( Typical_Price > 2.86684 )
									ret := -0.181818
					if( Negative_Money_Flow_Sum > 107161 )
						if( mf <= 0.010097 )
							if( Money_Flow_Ratio <= 0.667229 )
								ret := 0.100000
							if( Money_Flow_Ratio > 0.667229 )
								ret := 1.000000 // buy
						if( mf > 0.010097 )
							ret := -0.117647
				if( Raw_Money_Flow > 1757.28 )
					if( Positive_Money_Flow <= 24795.6 )
						if( ad_mf <= 0.076556 )
							if( ad_mf <= -11993.8 )
								ret := -0.750000 // sell
							if( ad_mf > -11993.8 )
								if( MFI_High <= -20.7008 )
									ret := -0.004525
								if( MFI_High > -20.7008 )
									ret := 0.408730
						if( ad_mf > 0.076556 )
							if( MFI <= 98.5333 )
								if( Money_Flow_Ratio <= 0.153552 )
									ret := 0.961538 // buy
								if( Money_Flow_Ratio > 0.153552 )
									ret := -0.223301
							if( MFI > 98.5333 )
								if( Positive_Money_Flow_Sum <= 1.20186e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.20186e+07 )
									ret := 0.615385
					if( Positive_Money_Flow > 24795.6 )
						if( Positive_Money_Flow_Sum <= 77942 )
							if( MFI_High <= -48.6308 )
								ret := -1.000000 // sell
							if( MFI_High > -48.6308 )
								if( mf <= 0.145609 )
									ret := -0.444444
								if( mf > 0.145609 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 77942 )
							if( mf <= -0.267904 )
								if( mf <= -0.301411 )
									ret := -0.346154
								if( mf > -0.301411 )
									ret := -0.903226 // sell
							if( mf > -0.267904 )
								if( Positive_Money_Flow_Sum <= 109155 )
									ret := 0.565217
								if( Positive_Money_Flow_Sum > 109155 )
									ret := -0.197263
		if( Negative_Money_Flow_Sum > 498212 )
			if( Negative_Money_Flow <= 7.49127 )
				if( MFI <= 80.5376 )
					if( ad <= 1.87637 )
						if( Negative_Money_Flow_Sum <= 2.53184e+07 )
							if( MFI_Low <= 55.1645 )
								if( Negative_Money_Flow_Sum <= 1.02369e+06 )
									ret := -0.176471
								if( Negative_Money_Flow_Sum > 1.02369e+06 )
									ret := 0.179868
							if( MFI_Low > 55.1645 )
								if( ad <= -814551 )
									ret := 0.857143 // buy
								if( ad > -814551 )
									ret := -0.405063
						if( Negative_Money_Flow_Sum > 2.53184e+07 )
							if( Raw_Money_Flow <= 901457 )
								if( Positive_Money_Flow_Sum <= 1.13284e+07 )
									ret := 0.705882 // buy
								if( Positive_Money_Flow_Sum > 1.13284e+07 )
									ret := -0.111111
							if( Raw_Money_Flow > 901457 )
								if( mf <= 0.018001 )
									ret := -0.398305
								if( mf > 0.018001 )
									ret := 0.044444
					if( ad > 1.87637 )
						if( Positive_Money_Flow <= 3.50113e+06 )
							if( MFI <= 4.32697 )
								if( ad_mf <= 2051.21 )
									ret := -0.882353 // sell
								if( ad_mf > 2051.21 )
									ret := -0.333333
							if( MFI > 4.32697 )
								if( MFI_Low <= -2.24216 )
									ret := 0.168831
								if( MFI_Low > -2.24216 )
									ret := -0.128329
						if( Positive_Money_Flow > 3.50113e+06 )
							if( Raw_Money_Flow <= 1.10416e+07 )
								if( MFI_Low <= 45.3014 )
									ret := 0.480000
								if( MFI_Low > 45.3014 )
									ret := -0.406250
							if( Raw_Money_Flow > 1.10416e+07 )
								if( ad_mf <= 2.59159e+06 )
									ret := -0.380952
								if( ad_mf > 2.59159e+06 )
									ret := -0.857143 // sell
				if( MFI > 80.5376 )
					if( Positive_Money_Flow_Sum <= 4.81012e+07 )
						if( mf <= 0.072283 )
							if( Positive_Money_Flow_Sum <= 2.26246e+07 )
								if( MFI <= 84.2723 )
									ret := 0.555556
								if( MFI > 84.2723 )
									ret := -0.065217
							if( Positive_Money_Flow_Sum > 2.26246e+07 )
								if( MFI_High <= 5.79038 )
									ret := -0.166667
								if( MFI_High > 5.79038 )
									ret := -0.666667
						if( mf > 0.072283 )
							if( mf <= 0.315905 )
								if( MFI_Low <= 72.3775 )
									ret := 0.676768
								if( MFI_Low > 72.3775 )
									ret := -0.111111
							if( mf > 0.315905 )
								if( MFI_Low <= 75.9523 )
									ret := 0.000000
								if( MFI_Low > 75.9523 )
									ret := 0.888889 // buy
					if( Positive_Money_Flow_Sum > 4.81012e+07 )
						if( Raw_Money_Flow <= 1.7946e+06 )
							ret := 0.000000
						if( Raw_Money_Flow > 1.7946e+06 )
							if( ad <= -659343 )
								ret := 0.437500
							if( ad > -659343 )
								if( Negative_Money_Flow_Sum <= 1.04551e+07 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 1.04551e+07 )
									ret := 1.000000 // buy
			if( Negative_Money_Flow > 7.49127 )
				if( Raw_Money_Flow <= 21549.3 )
					if( ad <= 251.389 )
						if( MFI_High <= -73.4788 )
							if( MFI_High <= -79.4762 )
								ret := 0.000000
							if( MFI_High > -79.4762 )
								if( Negative_Money_Flow_Sum <= 1.00737e+07 )
									ret := 0.851064 // buy
								if( Negative_Money_Flow_Sum > 1.00737e+07 )
									ret := 0.300000
						if( MFI_High > -73.4788 )
							if( Raw_Money_Flow <= 9677.05 )
								if( MFI_High <= -6.17084 )
									ret := 0.411765
								if( MFI_High > -6.17084 )
									ret := 0.219512
							if( Raw_Money_Flow > 9677.05 )
								if( MFI_High <= -49.2969 )
									ret := 0.333333
								if( MFI_High > -49.2969 )
									ret := 0.695652
					if( ad > 251.389 )
						if( Positive_Money_Flow_Sum <= 66685.6 )
							ret := -0.714286 // sell
						if( Positive_Money_Flow_Sum > 66685.6 )
							if( MFI_High <= -41.7086 )
								if( mf <= -0.204949 )
									ret := 0.000000
								if( mf > -0.204949 )
									ret := 0.600000
							if( MFI_High > -41.7086 )
								if( Negative_Money_Flow <= 1794.49 )
									ret := 0.631579
								if( Negative_Money_Flow > 1794.49 )
									ret := -0.117647
				if( Raw_Money_Flow > 21549.3 )
					if( ad_mf <= -1.50084e+06 )
						if( Money_Flow_Ratio <= 0.039708 )
							if( MFI <= 2.33443 )
								if( MFI_High <= -78.9277 )
									ret := 0.111111
								if( MFI_High > -78.9277 )
									ret := 0.600000
							if( MFI > 2.33443 )
								if( ad <= -3.83389e+06 )
									ret := 1.000000 // buy
								if( ad > -3.83389e+06 )
									ret := -0.818182 // sell
						if( Money_Flow_Ratio > 0.039708 )
							if( MFI <= 13.4993 )
								if( MFI_Low <= -15.5812 )
									ret := 0.555556
								if( MFI_Low > -15.5812 )
									ret := 0.957143 // buy
							if( MFI > 13.4993 )
								if( Negative_Money_Flow <= 6.76919e+06 )
									ret := 0.673684
								if( Negative_Money_Flow > 6.76919e+06 )
									ret := 0.246753
					if( ad_mf > -1.50084e+06 )
						if( Negative_Money_Flow_Sum <= 4.92748e+07 )
							if( ad <= 2720.32 )
								if( mf <= 0.350629 )
									ret := 0.168757
								if( mf > 0.350629 )
									ret := -0.292683
							if( ad > 2720.32 )
								if( Positive_Money_Flow_Sum <= 4.24041e+07 )
									ret := -0.027144
								if( Positive_Money_Flow_Sum > 4.24041e+07 )
									ret := -0.472727
						if( Negative_Money_Flow_Sum > 4.92748e+07 )
							if( Money_Flow_Ratio <= 0.108928 )
								if( Negative_Money_Flow <= 5.28114e+06 )
									ret := -0.872340 // sell
								if( Negative_Money_Flow > 5.28114e+06 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.108928 )
								if( MFI_High <= -39.0662 )
									ret := -0.138614
								if( MFI_High > -39.0662 )
									ret := 0.727273 // buy
	if( Typical_Price > 3.41467 )
		if( Negative_Money_Flow <= 1.51737e+08 )
			if( ad_mf <= 1241.72 )
				if( ad <= -12778.9 )
					if( MFI_Low <= 57.8021 )
						if( Positive_Money_Flow_Sum <= 3.88028e+06 )
							if( MFI <= 73.8321 )
								if( mf <= -0.145984 )
									ret := -0.009780
								if( mf > -0.145984 )
									ret := -0.138715
							if( MFI > 73.8321 )
								if( Money_Flow_Ratio <= 2.84898 )
									ret := -0.928571 // sell
								if( Money_Flow_Ratio > 2.84898 )
									ret := -0.438849
						if( Positive_Money_Flow_Sum > 3.88028e+06 )
							if( Raw_Money_Flow <= 1.36248e+06 )
								if( mf <= -0.256643 )
									ret := -0.079167
								if( mf > -0.256643 )
									ret := 0.113203
							if( Raw_Money_Flow > 1.36248e+06 )
								if( Positive_Money_Flow_Sum <= 2.87949e+07 )
									ret := -0.061672
								if( Positive_Money_Flow_Sum > 2.87949e+07 )
									ret := 0.003713
					if( MFI_Low > 57.8021 )
						if( ad <= -1.63654e+06 )
							if( Typical_Price <= 42.4165 )
								if( Positive_Money_Flow_Sum <= 1.95312e+08 )
									ret := 0.133047
								if( Positive_Money_Flow_Sum > 1.95312e+08 )
									ret := 0.404517
							if( Typical_Price > 42.4165 )
								if( Positive_Money_Flow_Sum <= 5.13264e+09 )
									ret := -0.307692
								if( Positive_Money_Flow_Sum > 5.13264e+09 )
									ret := 1.000000 // buy
						if( ad > -1.63654e+06 )
							if( Positive_Money_Flow_Sum <= 1.67412e+09 )
								if( Typical_Price <= 47.6696 )
									ret := 0.051017
								if( Typical_Price > 47.6696 )
									ret := -0.516129
							if( Positive_Money_Flow_Sum > 1.67412e+09 )
								if( ad <= -628434 )
									ret := 0.333333
								if( ad > -628434 )
									ret := 0.809524 // buy
				if( ad > -12778.9 )
					if( Raw_Money_Flow <= 32599.3 )
						if( ad <= -49.1778 )
							if( Negative_Money_Flow_Sum <= 65065.5 )
								if( Money_Flow_Ratio <= 2.08997 )
									ret := 0.266667
								if( Money_Flow_Ratio > 2.08997 )
									ret := -0.568966
							if( Negative_Money_Flow_Sum > 65065.5 )
								if( mf <= 0.636748 )
									ret := 0.270427
								if( mf > 0.636748 )
									ret := -0.424242
						if( ad > -49.1778 )
							if( Typical_Price <= 13.2983 )
								if( Raw_Money_Flow <= 1287.5 )
									ret := 0.209821
								if( Raw_Money_Flow > 1287.5 )
									ret := 0.068362
							if( Typical_Price > 13.2983 )
								if( Raw_Money_Flow <= 23780.8 )
									ret := -0.274194
								if( Raw_Money_Flow > 23780.8 )
									ret := 0.166667
					if( Raw_Money_Flow > 32599.3 )
						if( MFI_Low <= -13.9265 )
							if( MFI_High <= -78.2454 )
								if( Raw_Money_Flow <= 9.1718e+06 )
									ret := 0.136364
								if( Raw_Money_Flow > 9.1718e+06 )
									ret := -0.600000
							if( MFI_High > -78.2454 )
								if( mf <= -0.254912 )
									ret := -0.050000
								if( mf > -0.254912 )
									ret := 0.482587
						if( MFI_Low > -13.9265 )
							if( MFI <= 87.9359 )
								if( Negative_Money_Flow_Sum <= 717987 )
									ret := -0.087587
								if( Negative_Money_Flow_Sum > 717987 )
									ret := 0.041338
							if( MFI > 87.9359 )
								if( Positive_Money_Flow_Sum <= 733945 )
									ret := -0.909091 // sell
								if( Positive_Money_Flow_Sum > 733945 )
									ret := 0.167687
			if( ad_mf > 1241.72 )
				if( Negative_Money_Flow_Sum <= 4.03944e+06 )
					if( Positive_Money_Flow_Sum <= 288792 )
						if( Negative_Money_Flow <= 68171.9 )
							if( ad_mf <= 8104 )
								if( Negative_Money_Flow <= 39667.1 )
									ret := -0.303497
								if( Negative_Money_Flow > 39667.1 )
									ret := 0.422222
							if( ad_mf > 8104 )
								if( MFI_High <= -19.6421 )
									ret := -0.535032
								if( MFI_High > -19.6421 )
									ret := 0.196429
						if( Negative_Money_Flow > 68171.9 )
							if( Raw_Money_Flow <= 153434 )
								if( ad_mf <= 21270.1 )
									ret := -0.648936
								if( ad_mf > 21270.1 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 153434 )
								if( ad <= 10196.6 )
									ret := -0.875000 // sell
								if( ad > 10196.6 )
									ret := -0.182609
					if( Positive_Money_Flow_Sum > 288792 )
						if( mf <= -0.261021 )
							if( Negative_Money_Flow_Sum <= 181045 )
								if( MFI_High <= 5.72444 )
									ret := -1.000000 // sell
								if( MFI_High > 5.72444 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 181045 )
								if( MFI <= 89.9557 )
									ret := 0.079048
								if( MFI > 89.9557 )
									ret := 0.590909
						if( mf > -0.261021 )
							if( Positive_Money_Flow_Sum <= 6.42071e+07 )
								if( MFI <= 46.4721 )
									ret := -0.013299
								if( MFI > 46.4721 )
									ret := -0.160313
							if( Positive_Money_Flow_Sum > 6.42071e+07 )
								if( mf <= 0.634846 )
									ret := -0.019943
								if( mf > 0.634846 )
									ret := 0.695652
				if( Negative_Money_Flow_Sum > 4.03944e+06 )
					if( ad <= 54817.3 )
						if( Typical_Price <= 35.8641 )
							if( Positive_Money_Flow_Sum <= 579011 )
								if( mf <= 0.052996 )
									ret := 0.532847
								if( mf > 0.052996 )
									ret := 0.065574
							if( Positive_Money_Flow_Sum > 579011 )
								if( MFI_Low <= -1.35909 )
									ret := 0.166313
								if( MFI_Low > -1.35909 )
									ret := 0.043630
						if( Typical_Price > 35.8641 )
							if( Raw_Money_Flow <= 1.16531e+07 )
								if( mf <= 0.132979 )
									ret := -0.036505
								if( mf > 0.132979 )
									ret := -0.169435
							if( Raw_Money_Flow > 1.16531e+07 )
								if( Negative_Money_Flow <= 9.47684e+07 )
									ret := 0.205479
								if( Negative_Money_Flow > 9.47684e+07 )
									ret := 0.812500 // buy
					if( ad > 54817.3 )
						if( Positive_Money_Flow_Sum <= 6.17881e+07 )
							if( MFI <= 58.5011 )
								if( Negative_Money_Flow <= 7.79039e+07 )
									ret := -0.042627
								if( Negative_Money_Flow > 7.79039e+07 )
									ret := -0.406780
							if( MFI > 58.5011 )
								if( MFI_Low <= 40.9946 )
									ret := -0.464968
								if( MFI_Low > 40.9946 )
									ret := -0.111707
						if( Positive_Money_Flow_Sum > 6.17881e+07 )
							if( MFI <= 79.3542 )
								if( Raw_Money_Flow <= 9.83534e+06 )
									ret := 0.141529
								if( Raw_Money_Flow > 9.83534e+06 )
									ret := 0.023915
							if( MFI > 79.3542 )
								if( MFI_Low <= 70.397 )
									ret := -0.180547
								if( MFI_Low > 70.397 )
									ret := -0.004118
		if( Negative_Money_Flow > 1.51737e+08 )
			if( mf <= -0.32951 )
				if( Typical_Price <= 34.3029 )
					if( Typical_Price <= 20.2681 )
						if( mf <= -0.486836 )
							if( Negative_Money_Flow_Sum <= 2.59422e+08 )
								ret := -0.600000
							if( Negative_Money_Flow_Sum > 2.59422e+08 )
								ret := 0.666667
						if( mf > -0.486836 )
							ret := 0.913043 // buy
					if( Typical_Price > 20.2681 )
						if( Negative_Money_Flow_Sum <= 2.41504e+08 )
							if( MFI <= 7.36447 )
								ret := -0.300000
							if( MFI > 7.36447 )
								if( MFI_Low <= -11.7367 )
									ret := -0.800000 // sell
								if( MFI_Low > -11.7367 )
									ret := -0.461538
						if( Negative_Money_Flow_Sum > 2.41504e+08 )
							if( MFI_High <= -71.6877 )
								if( Raw_Money_Flow <= 2.129e+08 )
									ret := 0.285714
								if( Raw_Money_Flow > 2.129e+08 )
									ret := 0.733333 // buy
							if( MFI_High > -71.6877 )
								if( Typical_Price <= 30.8856 )
									ret := -0.600000
								if( Typical_Price > 30.8856 )
									ret := 0.200000
				if( Typical_Price > 34.3029 )
					if( Raw_Money_Flow <= 1.92544e+08 )
						if( mf <= -0.652066 )
							ret := -0.857143 // sell
						if( mf > -0.652066 )
							if( Positive_Money_Flow_Sum <= 1.11803e+07 )
								ret := -0.166667
							if( Positive_Money_Flow_Sum > 1.11803e+07 )
								if( Negative_Money_Flow <= 1.77929e+08 )
									ret := -0.058824
								if( Negative_Money_Flow > 1.77929e+08 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.92544e+08 )
						if( ad <= -8.76051e+06 )
							if( ad_mf <= -1.23739e+07 )
								ret := 0.777778 // buy
							if( ad_mf > -1.23739e+07 )
								if( Typical_Price <= 47.8456 )
									ret := 0.320000
								if( Typical_Price > 47.8456 )
									ret := -1.000000 // sell
						if( ad > -8.76051e+06 )
							if( MFI <= 8.48541 )
								if( MFI <= 3.7051 )
									ret := -0.482759
								if( MFI > 3.7051 )
									ret := -0.901515 // sell
							if( MFI > 8.48541 )
								if( Raw_Money_Flow <= 3.10627e+08 )
									ret := -0.781250 // sell
								if( Raw_Money_Flow > 3.10627e+08 )
									ret := -0.040000
			if( mf > -0.32951 )
				if( ad_mf <= -3.01117e+06 )
					if( MFI_Low <= 55.9289 )
						if( Positive_Money_Flow_Sum <= 5.30176e+09 )
							if( Typical_Price <= 52.8318 )
								if( Money_Flow_Ratio <= 2.13406 )
									ret := 0.557522
								if( Money_Flow_Ratio > 2.13406 )
									ret := 0.145833
							if( Typical_Price > 52.8318 )
								if( Negative_Money_Flow <= 4.48166e+08 )
									ret := -0.291667
								if( Negative_Money_Flow > 4.48166e+08 )
									ret := 0.621622
						if( Positive_Money_Flow_Sum > 5.30176e+09 )
							ret := -1.000000 // sell
					if( MFI_Low > 55.9289 )
						if( Raw_Money_Flow <= 3.21554e+08 )
							if( Negative_Money_Flow_Sum <= 4.30245e+08 )
								ret := 0.583333
							if( Negative_Money_Flow_Sum > 4.30245e+08 )
								ret := 0.933333 // buy
						if( Raw_Money_Flow > 3.21554e+08 )
							ret := 1.000000 // buy
				if( ad_mf > -3.01117e+06 )
					if( Positive_Money_Flow_Sum <= 5.26686e+08 )
						if( Raw_Money_Flow <= 1.55478e+08 )
							if( Raw_Money_Flow <= 1.53366e+08 )
								ret := 0.818182 // buy
							if( Raw_Money_Flow > 1.53366e+08 )
								ret := 0.363636
						if( Raw_Money_Flow > 1.55478e+08 )
							if( Negative_Money_Flow_Sum <= 2.08371e+08 )
								if( MFI <= 14.1639 )
									ret := 0.722222 // buy
								if( MFI > 14.1639 )
									ret := -0.230769
							if( Negative_Money_Flow_Sum > 2.08371e+08 )
								if( Money_Flow_Ratio <= 0.128351 )
									ret := -0.407407
								if( Money_Flow_Ratio > 0.128351 )
									ret := -0.090323
					if( Positive_Money_Flow_Sum > 5.26686e+08 )
						if( mf <= -0.04815 )
							if( MFI <= 33.698 )
								if( Typical_Price <= 46.3433 )
									ret := 0.891892 // buy
								if( Typical_Price > 46.3433 )
									ret := 0.196078
							if( MFI > 33.698 )
								if( Negative_Money_Flow_Sum <= 1.1228e+09 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 1.1228e+09 )
									ret := -0.093750
						if( mf > -0.04815 )
							if( ad_mf <= 220063 )
								if( ad_mf <= -2.08634e+06 )
									ret := 0.194444
								if( ad_mf > -2.08634e+06 )
									ret := 0.725410 // buy
							if( ad_mf > 220063 )
								if( MFI <= 76.0127 )
									ret := 0.029963
								if( MFI > 76.0127 )
									ret := 0.681818
	
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
float op_operation = decision_tree_0_NIO_15Min_30ee088e(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


