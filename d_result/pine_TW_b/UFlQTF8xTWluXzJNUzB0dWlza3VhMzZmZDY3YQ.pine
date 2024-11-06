//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: PYPL_1Min_2MS0_a36fd67a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2MS0_a36fd67a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_a36fd67a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI <= 34.656 )
		if( Positive_Money_Flow <= 62.4578 )
			if( Raw_Money_Flow <= 245797 )
				if( d_k <= 3.31322 )
					if( d <= 3.72526 )
						if( Positive_Money_Flow_Sum <= 319011 )
							if( Positive_Money_Flow_Sum <= 147858 )
								if( MFI_High <= -56.1943 )
									ret := -0.227273
								if( MFI_High > -56.1943 )
									ret := 0.320000
							if( Positive_Money_Flow_Sum > 147858 )
								if( Typical_Price <= 62.6355 )
									ret := -0.227273
								if( Typical_Price > 62.6355 )
									ret := -0.696429
						if( Positive_Money_Flow_Sum > 319011 )
							if( rsi1 <= 23.0674 )
								ret := 0.888889 // buy
							if( rsi1 > 23.0674 )
								if( Negative_Money_Flow_Sum <= 9.76806e+06 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 9.76806e+06 )
									ret := 0.000000
					if( d > 3.72526 )
						if( rsi1 <= 49.735 )
							if( MFI_High <= -45.9052 )
								if( Positive_Money_Flow_Sum <= 32460.7 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 32460.7 )
									ret := 0.215304
							if( MFI_High > -45.9052 )
								if( smoothK_k <= 31.5172 )
									ret := 0.823529 // buy
								if( smoothK_k > 31.5172 )
									ret := 0.750000 // buy
						if( rsi1 > 49.735 )
							if( Typical_Price <= 62.6183 )
								if( rsi1 <= 58.8543 )
									ret := -0.200000
								if( rsi1 > 58.8543 )
									ret := -0.693878
							if( Typical_Price > 62.6183 )
								if( Money_Flow_Ratio <= 0.386728 )
									ret := 0.197531
								if( Money_Flow_Ratio > 0.386728 )
									ret := -0.419048
				if( d_k > 3.31322 )
					if( Raw_Money_Flow <= 9981.01 )
						if( Negative_Money_Flow_Sum <= 548424 )
							if( Typical_Price <= 67.4526 )
								if( Negative_Money_Flow_Sum <= 442100 )
									ret := -0.214286
								if( Negative_Money_Flow_Sum > 442100 )
									ret := -0.857143 // sell
							if( Typical_Price > 67.4526 )
								if( Negative_Money_Flow_Sum <= 345875 )
									ret := 0.615385
								if( Negative_Money_Flow_Sum > 345875 )
									ret := -0.875000 // sell
						if( Negative_Money_Flow_Sum > 548424 )
							if( smoothK_k <= 2.8055 )
								ret := 0.750000 // buy
							if( smoothK_k > 2.8055 )
								if( Raw_Money_Flow <= 7967.39 )
									ret := -0.041667
								if( Raw_Money_Flow > 7967.39 )
									ret := 0.583333
					if( Raw_Money_Flow > 9981.01 )
						if( k <= 29.531 )
							if( Positive_Money_Flow_Sum <= 222050 )
								if( MFI <= 33.1833 )
									ret := 0.101392
								if( MFI > 33.1833 )
									ret := 0.647059
							if( Positive_Money_Flow_Sum > 222050 )
								if( d <= 12.4212 )
									ret := 0.000000
								if( d > 12.4212 )
									ret := 0.519774
						if( k > 29.531 )
							if( Negative_Money_Flow <= 4916 )
								if( Raw_Money_Flow <= 36739.5 )
									ret := -0.155556
								if( Raw_Money_Flow > 36739.5 )
									ret := 0.428571
							if( Negative_Money_Flow > 4916 )
								if( rsi1 <= 35.8823 )
									ret := 0.313953
								if( rsi1 > 35.8823 )
									ret := 0.621575
			if( Raw_Money_Flow > 245797 )
				if( Money_Flow_Ratio <= 0.023038 )
					if( MFI_Low <= -18.5962 )
						if( smoothK_k <= 14.1722 )
							if( Negative_Money_Flow <= 4.22482e+06 )
								if( Typical_Price <= 60.2464 )
									ret := 1.000000 // buy
								if( Typical_Price > 60.2464 )
									ret := -0.157895
							if( Negative_Money_Flow > 4.22482e+06 )
								if( MFI_Low <= -18.944 )
									ret := -1.000000 // sell
								if( MFI_Low > -18.944 )
									ret := -0.555556
						if( smoothK_k > 14.1722 )
							ret := 0.736842 // buy
					if( MFI_Low > -18.5962 )
						if( Negative_Money_Flow_Sum <= 4.24163e+07 )
							if( k <= 5.18792 )
								ret := -0.454545
							if( k > 5.18792 )
								if( Negative_Money_Flow <= 8.8476e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 8.8476e+06 )
									ret := -0.333333
						if( Negative_Money_Flow_Sum > 4.24163e+07 )
							ret := 0.133333
				if( Money_Flow_Ratio > 0.023038 )
					if( MFI <= 12.7854 )
						if( smoothK_k <= 31.8416 )
							if( Negative_Money_Flow_Sum <= 2.14868e+06 )
								if( MFI_High <= -73.8382 )
									ret := 1.000000 // buy
								if( MFI_High > -73.8382 )
									ret := 0.880952 // buy
							if( Negative_Money_Flow_Sum > 2.14868e+06 )
								if( Raw_Money_Flow <= 3.23542e+06 )
									ret := 0.116460
								if( Raw_Money_Flow > 3.23542e+06 )
									ret := 0.621622
						if( smoothK_k > 31.8416 )
							if( rsi1 <= 33.1499 )
								if( Negative_Money_Flow <= 3.15598e+06 )
									ret := 0.839286 // buy
								if( Negative_Money_Flow > 3.15598e+06 )
									ret := 0.312500
							if( rsi1 > 33.1499 )
								if( smoothK_k <= 88.6604 )
									ret := -0.382716
								if( smoothK_k > 88.6604 )
									ret := 0.666667
					if( MFI > 12.7854 )
						if( smoothD_d <= 0.961883 )
							if( Money_Flow_Ratio <= 0.20074 )
								if( d <= 3.30741 )
									ret := -0.254054
								if( d > 3.30741 )
									ret := -0.818182 // sell
							if( Money_Flow_Ratio > 0.20074 )
								if( Negative_Money_Flow <= 9.92399e+06 )
									ret := -0.012876
								if( Negative_Money_Flow > 9.92399e+06 )
									ret := 0.769231 // buy
						if( smoothD_d > 0.961883 )
							if( MFI_Low <= -3.11038 )
								if( Positive_Money_Flow_Sum <= 7.22705e+06 )
									ret := 0.148649
								if( Positive_Money_Flow_Sum > 7.22705e+06 )
									ret := 0.726316 // buy
							if( MFI_Low > -3.11038 )
								if( d <= 7.73639 )
									ret := 0.191595
								if( d > 7.73639 )
									ret := 0.043741
		if( Positive_Money_Flow > 62.4578 )
			if( MFI <= 8.31943 )
				if( d_k <= 2.25646 )
					if( rsi1 <= 57.4664 )
						if( Negative_Money_Flow_Sum <= 4.53875e+07 )
							if( d <= 8.36522 )
								if( Negative_Money_Flow_Sum <= 3.26825e+07 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 3.26825e+07 )
									ret := 1.000000 // buy
							if( d > 8.36522 )
								if( k <= 35.3697 )
									ret := -0.804878 // sell
								if( k > 35.3697 )
									ret := 0.079365
						if( Negative_Money_Flow_Sum > 4.53875e+07 )
							if( d_k <= -3.07576 )
								if( Negative_Money_Flow <= 2815.74 )
									ret := -0.704918 // sell
								if( Negative_Money_Flow > 2815.74 )
									ret := -1.000000 // sell
							if( d_k > -3.07576 )
								if( Money_Flow_Ratio <= 0.015391 )
									ret := -0.571429
								if( Money_Flow_Ratio > 0.015391 )
									ret := -0.125000
					if( rsi1 > 57.4664 )
						if( MFI_Low <= -18.5108 )
							ret := -0.555556
						if( MFI_Low > -18.5108 )
							if( smoothD_d <= 87.4287 )
								if( MFI_High <= -76.5116 )
									ret := -0.882353 // sell
								if( MFI_High > -76.5116 )
									ret := -1.000000 // sell
							if( smoothD_d > 87.4287 )
								ret := -0.700000 // sell
				if( d_k > 2.25646 )
					if( Negative_Money_Flow <= 34443.9 )
						if( d <= 38.0627 )
							if( d <= 24.6581 )
								if( smoothK_k <= 10.3764 )
									ret := 0.444444
								if( smoothK_k > 10.3764 )
									ret := -0.461538
							if( d > 24.6581 )
								ret := -0.833333 // sell
						if( d > 38.0627 )
							if( Typical_Price <= 63.4583 )
								ret := 0.454545
							if( Typical_Price > 63.4583 )
								if( MFI_Low <= -15.7058 )
									ret := 0.285714
								if( MFI_Low > -15.7058 )
									ret := -0.909091 // sell
					if( Negative_Money_Flow > 34443.9 )
						ret := 0.500000
			if( MFI > 8.31943 )
				if( d_k <= 9.41634 )
					if( MFI_High <= -61.5768 )
						if( d <= 82.3812 )
							if( rsi1 <= 55.2166 )
								if( MFI <= 13.8273 )
									ret := 0.087167
								if( MFI > 13.8273 )
									ret := 0.285917
							if( rsi1 > 55.2166 )
								if( d_k <= -2.35521 )
									ret := -0.943396 // sell
								if( d_k > -2.35521 )
									ret := -0.324324
						if( d > 82.3812 )
							if( Positive_Money_Flow_Sum <= 1.76424e+07 )
								if( k <= 96.4898 )
									ret := -0.333333
								if( k > 96.4898 )
									ret := 0.058824
							if( Positive_Money_Flow_Sum > 1.76424e+07 )
								ret := -1.000000 // sell
					if( MFI_High > -61.5768 )
						if( Negative_Money_Flow_Sum <= 2.50216e+07 )
							if( MFI_High <= -56.6515 )
								if( Positive_Money_Flow_Sum <= 139151 )
									ret := -0.525547
								if( Positive_Money_Flow_Sum > 139151 )
									ret := -0.126744
							if( MFI_High > -56.6515 )
								if( k <= 46.3722 )
									ret := -0.024513
								if( k > 46.3722 )
									ret := 0.089733
						if( Negative_Money_Flow_Sum > 2.50216e+07 )
							if( MFI_High <= -59.0076 )
								if( rsi1 <= 56.0158 )
									ret := 0.317829
								if( rsi1 > 56.0158 )
									ret := -0.724138 // sell
							if( MFI_High > -59.0076 )
								if( Money_Flow_Ratio <= 0.40377 )
									ret := -0.430712
								if( Money_Flow_Ratio > 0.40377 )
									ret := -0.113695
				if( d_k > 9.41634 )
					if( Positive_Money_Flow <= 1.62567e+06 )
						if( Negative_Money_Flow_Sum <= 1.63795e+06 )
							if( Positive_Money_Flow <= 66942 )
								if( Typical_Price <= 67.7712 )
									ret := 0.284946
								if( Typical_Price > 67.7712 )
									ret := 0.617021
							if( Positive_Money_Flow > 66942 )
								if( Positive_Money_Flow_Sum <= 330996 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 330996 )
									ret := 0.727273 // buy
						if( Negative_Money_Flow_Sum > 1.63795e+06 )
							if( MFI <= 30.8988 )
								if( MFI_Low <= -5.2596 )
									ret := -0.409091
								if( MFI_Low > -5.2596 )
									ret := 0.290323
							if( MFI > 30.8988 )
								if( Positive_Money_Flow <= 1.42487e+06 )
									ret := -0.278481
								if( Positive_Money_Flow > 1.42487e+06 )
									ret := 0.714286 // buy
					if( Positive_Money_Flow > 1.62567e+06 )
						if( Raw_Money_Flow <= 2.38739e+06 )
							if( Raw_Money_Flow <= 1.7518e+06 )
								ret := -0.928571 // sell
							if( Raw_Money_Flow > 1.7518e+06 )
								if( Positive_Money_Flow <= 2.18729e+06 )
									ret := -0.384615
								if( Positive_Money_Flow > 2.18729e+06 )
									ret := -0.800000 // sell
						if( Raw_Money_Flow > 2.38739e+06 )
							if( Negative_Money_Flow_Sum <= 3.38672e+07 )
								if( d <= 64.0078 )
									ret := 0.615385
								if( d > 64.0078 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.38672e+07 )
								if( Positive_Money_Flow <= 4.46973e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 4.46973e+06 )
									ret := -0.769231 // sell
	if( MFI > 34.656 )
		if( Positive_Money_Flow <= 4270.5 )
			if( Negative_Money_Flow_Sum <= 1.90008e+06 )
				if( smoothK_k <= 72.3543 )
					if( MFI <= 94.4567 )
						if( Typical_Price <= 79.9315 )
							if( rsi1 <= 50.7937 )
								if( Typical_Price <= 65.5663 )
									ret := 0.231267
								if( Typical_Price > 65.5663 )
									ret := 0.403369
							if( rsi1 > 50.7937 )
								if( d_k <= -2.36414 )
									ret := -0.162826
								if( d_k > -2.36414 )
									ret := 0.135781
						if( Typical_Price > 79.9315 )
							if( Money_Flow_Ratio <= 0.949732 )
								if( Typical_Price <= 80.2677 )
									ret := 0.066667
								if( Typical_Price > 80.2677 )
									ret := -0.741935 // sell
							if( Money_Flow_Ratio > 0.949732 )
								if( Positive_Money_Flow_Sum <= 267229 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow_Sum > 267229 )
									ret := 0.000000
					if( MFI > 94.4567 )
						if( d_k <= -2.38017 )
							if( Positive_Money_Flow_Sum <= 4.83696e+06 )
								ret := -0.333333
							if( Positive_Money_Flow_Sum > 4.83696e+06 )
								if( Typical_Price <= 59.5 )
									ret := 0.454545
								if( Typical_Price > 59.5 )
									ret := 0.083333
						if( d_k > -2.38017 )
							if( Money_Flow_Ratio <= 444.602 )
								if( smoothD_d <= 57.5264 )
									ret := 0.848485 // buy
								if( smoothD_d > 57.5264 )
									ret := 0.444444
							if( Money_Flow_Ratio > 444.602 )
								ret := 0.000000
				if( smoothK_k > 72.3543 )
					if( Positive_Money_Flow_Sum <= 163740 )
						if( Negative_Money_Flow_Sum <= 229404 )
							if( MFI_Low <= 52.7192 )
								if( Negative_Money_Flow <= 25932 )
									ret := 0.511450
								if( Negative_Money_Flow > 25932 )
									ret := -0.061224
							if( MFI_Low > 52.7192 )
								ret := -0.666667
						if( Negative_Money_Flow_Sum > 229404 )
							ret := -0.928571 // sell
					if( Positive_Money_Flow_Sum > 163740 )
						if( rsi1 <= 50.3834 )
							if( d_k <= -15.9511 )
								if( MFI_Low <= 30.1768 )
									ret := -0.857143 // sell
								if( MFI_Low > 30.1768 )
									ret := -0.185185
							if( d_k > -15.9511 )
								if( Typical_Price <= 60.8345 )
									ret := 0.045455
								if( Typical_Price > 60.8345 )
									ret := 0.490798
						if( rsi1 > 50.3834 )
							if( Typical_Price <= 65.495 )
								if( Positive_Money_Flow_Sum <= 1.8929e+07 )
									ret := -0.219348
								if( Positive_Money_Flow_Sum > 1.8929e+07 )
									ret := 0.842105 // buy
							if( Typical_Price > 65.495 )
								if( MFI_High <= -7.45208 )
									ret := -0.105121
								if( MFI_High > -7.45208 )
									ret := 0.187302
			if( Negative_Money_Flow_Sum > 1.90008e+06 )
				if( MFI <= 87.4653 )
					if( Positive_Money_Flow_Sum <= 4.54149e+07 )
						if( rsi1 <= 32.9177 )
							if( smoothK_k <= 1.23918 )
								if( Negative_Money_Flow <= 759128 )
									ret := -0.205882
								if( Negative_Money_Flow > 759128 )
									ret := 0.125424
							if( smoothK_k > 1.23918 )
								if( Negative_Money_Flow_Sum <= 1.25204e+07 )
									ret := -0.136042
								if( Negative_Money_Flow_Sum > 1.25204e+07 )
									ret := -0.373576
						if( rsi1 > 32.9177 )
							if( MFI_High <= -14.6782 )
								if( MFI_High <= -17.4482 )
									ret := -0.008178
								if( MFI_High > -17.4482 )
									ret := 0.150338
							if( MFI_High > -14.6782 )
								if( d_k <= 19.0599 )
									ret := -0.060259
								if( d_k > 19.0599 )
									ret := -0.344262
					if( Positive_Money_Flow_Sum > 4.54149e+07 )
						if( smoothD_d <= 33.7244 )
							if( rsi1 <= 31.2802 )
								if( Money_Flow_Ratio <= 1.61293 )
									ret := -0.500000
								if( Money_Flow_Ratio > 1.61293 )
									ret := 0.628571
							if( rsi1 > 31.2802 )
								if( Typical_Price <= 73.059 )
									ret := -0.391089
								if( Typical_Price > 73.059 )
									ret := 0.473684
						if( smoothD_d > 33.7244 )
							if( d_k <= 23.0709 )
								if( Raw_Money_Flow <= 6.70735e+06 )
									ret := 0.255132
								if( Raw_Money_Flow > 6.70735e+06 )
									ret := 0.618557
							if( d_k > 23.0709 )
								if( Negative_Money_Flow <= 2.88653e+06 )
									ret := 0.500000
								if( Negative_Money_Flow > 2.88653e+06 )
									ret := -0.818182 // sell
				if( MFI > 87.4653 )
					if( MFI_Low <= 75.4284 )
						if( Negative_Money_Flow <= 1.83716e+06 )
							if( Negative_Money_Flow <= 1.68631e+06 )
								if( Typical_Price <= 62.2919 )
									ret := -0.222222
								if( Typical_Price > 62.2919 )
									ret := 0.291971
							if( Negative_Money_Flow > 1.68631e+06 )
								ret := -0.692308
						if( Negative_Money_Flow > 1.83716e+06 )
							if( Negative_Money_Flow <= 2.40506e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 2.40506e+06 )
								ret := 0.500000
					if( MFI_Low > 75.4284 )
						if( MFI_High <= 15.9092 )
							ret := 0.933333 // buy
						if( MFI_High > 15.9092 )
							if( d_k <= 3.48726 )
								ret := 0.125000
							if( d_k > 3.48726 )
								ret := 0.642857
		if( Positive_Money_Flow > 4270.5 )
			if( Negative_Money_Flow_Sum <= 1.20191e+06 )
				if( Positive_Money_Flow_Sum <= 146393 )
					if( rsi1 <= 57.54 )
						if( smoothK_k <= 60.551 )
							if( Money_Flow_Ratio <= 0.614319 )
								if( k <= 52.1462 )
									ret := -0.307692
								if( k > 52.1462 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.614319 )
								if( Typical_Price <= 61.697 )
									ret := 0.814815 // buy
								if( Typical_Price > 61.697 )
									ret := 0.479675
						if( smoothK_k > 60.551 )
							if( d_k <= 4.21213 )
								if( Positive_Money_Flow <= 14816.3 )
									ret := -0.142857
								if( Positive_Money_Flow > 14816.3 )
									ret := 0.500000
							if( d_k > 4.21213 )
								ret := -1.000000 // sell
					if( rsi1 > 57.54 )
						if( Money_Flow_Ratio <= 1.47901 )
							if( d <= 68.3992 )
								if( Positive_Money_Flow_Sum <= 74119.3 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 74119.3 )
									ret := -0.357143
							if( d > 68.3992 )
								if( d <= 76.5012 )
									ret := 0.076923
								if( d > 76.5012 )
									ret := -0.421053
						if( Money_Flow_Ratio > 1.47901 )
							if( MFI <= 64.048 )
								ret := 0.333333
							if( MFI > 64.048 )
								ret := -0.090909
				if( Positive_Money_Flow_Sum > 146393 )
					if( k <= 19.5828 )
						if( rsi1 <= 43.2807 )
							if( smoothD_d <= 5.21332 )
								if( rsi1 <= 32.4768 )
									ret := -0.219512
								if( rsi1 > 32.4768 )
									ret := 0.300000
							if( smoothD_d > 5.21332 )
								if( smoothK_k <= 2.40376 )
									ret := -0.142857
								if( smoothK_k > 2.40376 )
									ret := 0.509804
						if( rsi1 > 43.2807 )
							if( MFI <= 83.8582 )
								if( Positive_Money_Flow <= 11197 )
									ret := -0.476190
								if( Positive_Money_Flow > 11197 )
									ret := -0.015306
							if( MFI > 83.8582 )
								if( Positive_Money_Flow_Sum <= 2.58583e+06 )
									ret := 0.647059
								if( Positive_Money_Flow_Sum > 2.58583e+06 )
									ret := 0.000000
					if( k > 19.5828 )
						if( d_k <= -2.43186 )
							if( smoothD_d <= 22.8358 )
								if( MFI <= 80.001 )
									ret := -0.184615
								if( MFI > 80.001 )
									ret := 0.294737
							if( smoothD_d > 22.8358 )
								if( rsi1 <= 62.249 )
									ret := -0.207618
								if( rsi1 > 62.249 )
									ret := -0.389856
						if( d_k > -2.43186 )
							if( Raw_Money_Flow <= 2.30891e+06 )
								if( Money_Flow_Ratio <= 1.2564 )
									ret := -0.190840
								if( Money_Flow_Ratio > 1.2564 )
									ret := -0.022286
							if( Raw_Money_Flow > 2.30891e+06 )
								if( MFI_High <= 14.409 )
									ret := 0.300000
								if( MFI_High > 14.409 )
									ret := -0.740741 // sell
			if( Negative_Money_Flow_Sum > 1.20191e+06 )
				if( Positive_Money_Flow_Sum <= 2.03583e+07 )
					if( Positive_Money_Flow <= 5.15572e+06 )
						if( MFI_High <= -8.07318 )
							if( d_k <= 3.2629 )
								if( d <= 25.5039 )
									ret := -0.000477
								if( d > 25.5039 )
									ret := -0.060836
							if( d_k > 3.2629 )
								if( Positive_Money_Flow_Sum <= 1.40469e+07 )
									ret := 0.006799
								if( Positive_Money_Flow_Sum > 1.40469e+07 )
									ret := 0.193593
						if( MFI_High > -8.07318 )
							if( smoothK_k <= 26.6956 )
								if( d_k <= 1.5723 )
									ret := 0.504950
								if( d_k > 1.5723 )
									ret := 0.142857
							if( smoothK_k > 26.6956 )
								if( Positive_Money_Flow_Sum <= 5.30016e+06 )
									ret := 0.611650
								if( Positive_Money_Flow_Sum > 5.30016e+06 )
									ret := 0.024805
					if( Positive_Money_Flow > 5.15572e+06 )
						if( Negative_Money_Flow_Sum <= 2.7893e+07 )
							if( Negative_Money_Flow_Sum <= 8.91339e+06 )
								if( Typical_Price <= 72.7729 )
									ret := 0.792453 // buy
								if( Typical_Price > 72.7729 )
									ret := 0.083333
							if( Negative_Money_Flow_Sum > 8.91339e+06 )
								if( MFI_High <= -34.0057 )
									ret := 0.630435
								if( MFI_High > -34.0057 )
									ret := -0.020000
						if( Negative_Money_Flow_Sum > 2.7893e+07 )
							ret := -0.636364
				if( Positive_Money_Flow_Sum > 2.03583e+07 )
					if( Raw_Money_Flow <= 1.79043e+07 )
						if( rsi1 <= 32.9569 )
							if( MFI_High <= -31.9483 )
								if( Negative_Money_Flow_Sum <= 4.34505e+07 )
									ret := -0.521739
								if( Negative_Money_Flow_Sum > 4.34505e+07 )
									ret := 0.833333 // buy
							if( MFI_High > -31.9483 )
								if( k <= 6.32554 )
									ret := -0.230769
								if( k > 6.32554 )
									ret := 0.662338
						if( rsi1 > 32.9569 )
							if( Raw_Money_Flow <= 3.08424e+06 )
								if( MFI_Low <= 48.6842 )
									ret := -0.049855
								if( MFI_Low > 48.6842 )
									ret := -0.229622
							if( Raw_Money_Flow > 3.08424e+06 )
								if( k <= 19.0627 )
									ret := -0.484444
								if( k > 19.0627 )
									ret := 0.023246
					if( Raw_Money_Flow > 1.79043e+07 )
						if( d_k <= -13.8298 )
							if( d <= 53.1208 )
								ret := 0.181818
							if( d > 53.1208 )
								if( Raw_Money_Flow <= 3.63589e+07 )
									ret := 0.818182 // buy
								if( Raw_Money_Flow > 3.63589e+07 )
									ret := 1.000000 // buy
						if( d_k > -13.8298 )
							if( Positive_Money_Flow_Sum <= 7.38963e+07 )
								if( k <= 37.347 )
									ret := 0.125000
								if( k > 37.347 )
									ret := -0.636364
							if( Positive_Money_Flow_Sum > 7.38963e+07 )
								if( Raw_Money_Flow <= 4.02653e+07 )
									ret := -0.890411 // sell
								if( Raw_Money_Flow > 4.02653e+07 )
									ret := -0.666667
	
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
float op_operation = decision_tree_0_PYPL_1Min_a36fd67a(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


