//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: MSFT_1Min_2MM0_6504a676 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2MM0_6504a676", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_6504a676(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.72465e+06 )
		if( Short_Long_Diff <= -0.296922 )
			if( Negative_Money_Flow_Sum <= 2.04571e+06 )
				if( MFI_Low <= 23.7234 )
					if( Negative_Money_Flow <= 63050.2 )
						if( Negative_Money_Flow_Sum <= 1.44136e+06 )
							if( Positive_Money_Flow_Sum <= 907022 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 907022 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.44136e+06 )
							if( Negative_Money_Flow_Sum <= 1.58814e+06 )
								if( MFI_High <= -44.0356 )
									ret := 1.000000 // buy
								if( MFI_High > -44.0356 )
									ret := 0.200000
							if( Negative_Money_Flow_Sum > 1.58814e+06 )
								if( Typical_Price <= 434.025 )
									ret := -0.117647
								if( Typical_Price > 434.025 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow > 63050.2 )
						if( MFI_High <= -52.3646 )
							ret := 0.250000
						if( MFI_High > -52.3646 )
							if( Short_MA <= 414.164 )
								if( Negative_Money_Flow <= 462843 )
									ret := -0.615385
								if( Negative_Money_Flow > 462843 )
									ret := 0.500000
							if( Short_MA > 414.164 )
								if( Long_MA <= 438.278 )
									ret := -0.904762 // sell
								if( Long_MA > 438.278 )
									ret := -0.500000
				if( MFI_Low > 23.7234 )
					if( Positive_Money_Flow_Sum <= 1.36721e+06 )
						if( Short_Long_Diff <= -0.703363 )
							ret := 0.000000
						if( Short_Long_Diff > -0.703363 )
							if( Positive_Money_Flow <= 77326 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 77326 )
								ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 1.36721e+06 )
						if( Negative_Money_Flow_Sum <= 1.87927e+06 )
							if( Positive_Money_Flow <= 355513 )
								if( Negative_Money_Flow <= 110371 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 110371 )
									ret := -0.600000
							if( Positive_Money_Flow > 355513 )
								ret := 0.500000
						if( Negative_Money_Flow_Sum > 1.87927e+06 )
							ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 2.04571e+06 )
				if( Money_Flow_Ratio <= 0.011353 )
					if( Raw_Money_Flow <= 1.72752e+07 )
						if( Negative_Money_Flow_Sum <= 1.55982e+08 )
							ret := -0.500000
						if( Negative_Money_Flow_Sum > 1.55982e+08 )
							if( Negative_Money_Flow_Sum <= 1.98196e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.98196e+08 )
								ret := 0.428571
					if( Raw_Money_Flow > 1.72752e+07 )
						if( Money_Flow_Ratio <= 0.001991 )
							if( Raw_Money_Flow <= 3.72394e+07 )
								if( Money_Flow_Ratio <= 0.000782 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.000782 )
									ret := -0.500000
							if( Raw_Money_Flow > 3.72394e+07 )
								ret := 0.500000
						if( Money_Flow_Ratio > 0.001991 )
							if( Negative_Money_Flow_Sum <= 1.96103e+08 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.96103e+08 )
								if( Typical_Price <= 413.856 )
									ret := -0.750000 // sell
								if( Typical_Price > 413.856 )
									ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.011353 )
					if( Positive_Money_Flow <= 666120 )
						if( Typical_Price <= 397.675 )
							if( Short_Long_Diff <= -0.720468 )
								if( Negative_Money_Flow <= 874016 )
									ret := -0.166667
								if( Negative_Money_Flow > 874016 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > -0.720468 )
								if( Positive_Money_Flow_Sum <= 947308 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 947308 )
									ret := 0.200000
						if( Typical_Price > 397.675 )
							if( Negative_Money_Flow_Sum <= 6.30256e+06 )
								if( Raw_Money_Flow <= 965896 )
									ret := 0.414330
								if( Raw_Money_Flow > 965896 )
									ret := -0.531250
							if( Negative_Money_Flow_Sum > 6.30256e+06 )
								if( Positive_Money_Flow <= 518904 )
									ret := 0.641975
								if( Positive_Money_Flow > 518904 )
									ret := -0.272727
					if( Positive_Money_Flow > 666120 )
						if( Negative_Money_Flow_Sum <= 7.28463e+06 )
							if( MFI_High <= -54.3815 )
								ret := -1.000000 // sell
							if( MFI_High > -54.3815 )
								ret := -0.500000
						if( Negative_Money_Flow_Sum > 7.28463e+06 )
							ret := 0.000000
		if( Short_Long_Diff > -0.296922 )
			if( Positive_Money_Flow <= 28483.9 )
				if( Typical_Price <= 448.358 )
					if( MFI_Low <= 38.0193 )
						if( Raw_Money_Flow <= 67128.6 )
							if( MFI_Low <= 37.2608 )
								if( Short_Long_Diff <= -0.172226 )
									ret := 0.371429
								if( Short_Long_Diff > -0.172226 )
									ret := 0.006494
							if( MFI_Low > 37.2608 )
								ret := -0.714286 // sell
						if( Raw_Money_Flow > 67128.6 )
							if( MFI <= 32.9209 )
								if( Short_Long_Diff <= -0.167507 )
									ret := 0.311301
								if( Short_Long_Diff > -0.167507 )
									ret := 0.142724
							if( MFI > 32.9209 )
								if( Long_MA <= 413.16 )
									ret := 0.410901
								if( Long_MA > 413.16 )
									ret := 0.233202
					if( MFI_Low > 38.0193 )
						if( Typical_Price <= 424.802 )
							if( Positive_Money_Flow_Sum <= 1.15877e+06 )
								if( MFI_Low <= 52.6038 )
									ret := 0.724138 // buy
								if( MFI_Low > 52.6038 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 1.15877e+06 )
								if( Raw_Money_Flow <= 186917 )
									ret := -0.490741
								if( Raw_Money_Flow > 186917 )
									ret := 0.000000
						if( Typical_Price > 424.802 )
							if( Money_Flow_Ratio <= 1.45746 )
								ret := -0.142857
							if( Money_Flow_Ratio > 1.45746 )
								if( Negative_Money_Flow <= 117911 )
									ret := 0.710526 // buy
								if( Negative_Money_Flow > 117911 )
									ret := 0.315789
				if( Typical_Price > 448.358 )
					if( Short_MA <= 468.601 )
						if( Short_MA <= 457.192 )
							if( Negative_Money_Flow_Sum <= 3.4956e+06 )
								if( Long_MA <= 453.859 )
									ret := 0.046154
								if( Long_MA > 453.859 )
									ret := -0.355932
							if( Negative_Money_Flow_Sum > 3.4956e+06 )
								if( Negative_Money_Flow_Sum <= 4.26682e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 4.26682e+06 )
									ret := -0.016393
						if( Short_MA > 457.192 )
							if( Short_Long_Diff <= 0.014736 )
								if( Positive_Money_Flow_Sum <= 1.35652e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.35652e+06 )
									ret := 0.294118
							if( Short_Long_Diff > 0.014736 )
								if( Negative_Money_Flow_Sum <= 2.1374e+06 )
									ret := 0.542857
								if( Negative_Money_Flow_Sum > 2.1374e+06 )
									ret := 0.000000
					if( Short_MA > 468.601 )
						ret := -1.000000 // sell
			if( Positive_Money_Flow > 28483.9 )
				if( MFI_Low <= 6.95541 )
					if( Negative_Money_Flow_Sum <= 1.61039e+06 )
						if( Positive_Money_Flow <= 131326 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 131326 )
							ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 1.61039e+06 )
						if( Negative_Money_Flow_Sum <= 1.01151e+07 )
							if( Negative_Money_Flow <= 2486.82 )
								if( Negative_Money_Flow_Sum <= 7.34618e+06 )
									ret := -0.193396
								if( Negative_Money_Flow_Sum > 7.34618e+06 )
									ret := 0.500000
							if( Negative_Money_Flow > 2486.82 )
								if( Positive_Money_Flow_Sum <= 1.49186e+06 )
									ret := 0.107143
								if( Positive_Money_Flow_Sum > 1.49186e+06 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.01151e+07 )
							if( Negative_Money_Flow_Sum <= 1.14625e+07 )
								if( Raw_Money_Flow <= 89888.8 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 89888.8 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.14625e+07 )
								if( Negative_Money_Flow <= 4513.7 )
									ret := -0.179245
								if( Negative_Money_Flow > 4513.7 )
									ret := -0.777778 // sell
				if( MFI_Low > 6.95541 )
					if( Negative_Money_Flow_Sum <= 2.29779e+06 )
						if( Negative_Money_Flow_Sum <= 2.16206e+06 )
							if( Positive_Money_Flow_Sum <= 955537 )
								if( MFI_Low <= 37.6021 )
									ret := -0.216216
								if( MFI_Low > 37.6021 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 955537 )
								if( Typical_Price <= 439.006 )
									ret := 0.157058
								if( Typical_Price > 439.006 )
									ret := -0.093596
						if( Negative_Money_Flow_Sum > 2.16206e+06 )
							if( Positive_Money_Flow <= 141517 )
								if( Positive_Money_Flow_Sum <= 1.09438e+06 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 1.09438e+06 )
									ret := -0.866667 // sell
							if( Positive_Money_Flow > 141517 )
								if( Raw_Money_Flow <= 729233 )
									ret := -0.090909
								if( Raw_Money_Flow > 729233 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.29779e+06 )
						if( Typical_Price <= 439.514 )
							if( Positive_Money_Flow <= 189057 )
								if( MFI_High <= -50.6263 )
									ret := 0.105263
								if( MFI_High > -50.6263 )
									ret := 0.516556
							if( Positive_Money_Flow > 189057 )
								if( Short_Long_Diff <= -0.226211 )
									ret := 0.583333
								if( Short_Long_Diff > -0.226211 )
									ret := 0.012048
						if( Typical_Price > 439.514 )
							if( Long_MA <= 460.998 )
								if( Short_Long_Diff <= 0.104108 )
									ret := -0.280000
								if( Short_Long_Diff > 0.104108 )
									ret := 0.500000
							if( Long_MA > 460.998 )
								ret := 1.000000 // buy
	if( Positive_Money_Flow_Sum > 1.72465e+06 )
		if( Short_Long_Diff <= 0.392351 )
			if( Positive_Money_Flow <= 1.78209e+07 )
				if( Negative_Money_Flow <= 1566.93 )
					if( Positive_Money_Flow_Sum <= 3.05423e+07 )
						if( Typical_Price <= 408.853 )
							if( Negative_Money_Flow_Sum <= 1.5891e+07 )
								if( Negative_Money_Flow_Sum <= 1.16979e+06 )
									ret := -0.162679
								if( Negative_Money_Flow_Sum > 1.16979e+06 )
									ret := 0.108682
							if( Negative_Money_Flow_Sum > 1.5891e+07 )
								if( Negative_Money_Flow_Sum <= 2.45716e+07 )
									ret := -0.494382
								if( Negative_Money_Flow_Sum > 2.45716e+07 )
									ret := -0.051546
						if( Typical_Price > 408.853 )
							if( Positive_Money_Flow_Sum <= 4.73839e+06 )
								if( Negative_Money_Flow_Sum <= 6.22298e+06 )
									ret := 0.001275
								if( Negative_Money_Flow_Sum > 6.22298e+06 )
									ret := -0.196949
							if( Positive_Money_Flow_Sum > 4.73839e+06 )
								if( Short_Long_Diff <= -0.081315 )
									ret := -0.015385
								if( Short_Long_Diff > -0.081315 )
									ret := -0.216954
					if( Positive_Money_Flow_Sum > 3.05423e+07 )
						if( MFI_High <= -60.1237 )
							if( Long_MA <= 432.124 )
								if( Raw_Money_Flow <= 7.90851e+06 )
									ret := -0.125628
								if( Raw_Money_Flow > 7.90851e+06 )
									ret := -0.430233
							if( Long_MA > 432.124 )
								if( Short_Long_Diff <= -0.315236 )
									ret := 0.500000
								if( Short_Long_Diff > -0.315236 )
									ret := -0.086207
						if( MFI_High > -60.1237 )
							if( Short_Long_Diff <= -0.890631 )
								if( Short_MA <= 414.217 )
									ret := -0.111111
								if( Short_MA > 414.217 )
									ret := 0.673077
							if( Short_Long_Diff > -0.890631 )
								if( Short_Long_Diff <= -0.697953 )
									ret := -0.187500
								if( Short_Long_Diff > -0.697953 )
									ret := 0.040972
				if( Negative_Money_Flow > 1566.93 )
					if( Negative_Money_Flow_Sum <= 1.26109e+06 )
						if( Long_MA <= 426.747 )
							if( Negative_Money_Flow <= 110640 )
								if( Positive_Money_Flow_Sum <= 1.91177e+06 )
									ret := -0.571429
								if( Positive_Money_Flow_Sum > 1.91177e+06 )
									ret := 0.644330
							if( Negative_Money_Flow > 110640 )
								if( Negative_Money_Flow_Sum <= 1.22168e+06 )
									ret := 0.205357
								if( Negative_Money_Flow_Sum > 1.22168e+06 )
									ret := 0.655172
						if( Long_MA > 426.747 )
							if( Short_MA <= 436.808 )
								if( Money_Flow_Ratio <= 5.24018 )
									ret := -0.256410
								if( Money_Flow_Ratio > 5.24018 )
									ret := 0.172414
							if( Short_MA > 436.808 )
								if( Short_Long_Diff <= 0.128458 )
									ret := 0.000000
								if( Short_Long_Diff > 0.128458 )
									ret := 0.615385
					if( Negative_Money_Flow_Sum > 1.26109e+06 )
						if( Positive_Money_Flow_Sum <= 1.14945e+07 )
							if( Typical_Price <= 429.429 )
								if( Short_Long_Diff <= -0.047618 )
									ret := 0.212468
								if( Short_Long_Diff > -0.047618 )
									ret := 0.099966
							if( Typical_Price > 429.429 )
								if( Money_Flow_Ratio <= 0.027907 )
									ret := -0.338983
								if( Money_Flow_Ratio > 0.027907 )
									ret := 0.037637
						if( Positive_Money_Flow_Sum > 1.14945e+07 )
							if( Negative_Money_Flow <= 1.2979e+07 )
								if( Short_MA <= 403.707 )
									ret := -0.106129
								if( Short_MA > 403.707 )
									ret := 0.032823
							if( Negative_Money_Flow > 1.2979e+07 )
								if( MFI_High <= -54.2429 )
									ret := 0.010518
								if( MFI_High > -54.2429 )
									ret := 0.118193
			if( Positive_Money_Flow > 1.78209e+07 )
				if( Long_MA <= 417.499 )
					if( Positive_Money_Flow <= 1.04195e+08 )
						if( Raw_Money_Flow <= 3.47302e+07 )
							if( Raw_Money_Flow <= 2.62159e+07 )
								if( Negative_Money_Flow_Sum <= 6.27019e+07 )
									ret := -0.080882
								if( Negative_Money_Flow_Sum > 6.27019e+07 )
									ret := 0.261481
							if( Raw_Money_Flow > 2.62159e+07 )
								if( Negative_Money_Flow_Sum <= 4.44118e+08 )
									ret := 0.086093
								if( Negative_Money_Flow_Sum > 4.44118e+08 )
									ret := -0.441860
						if( Raw_Money_Flow > 3.47302e+07 )
							if( Positive_Money_Flow_Sum <= 8.21744e+08 )
								if( Short_MA <= 400.163 )
									ret := 0.628205
								if( Short_MA > 400.163 )
									ret := 0.356371
							if( Positive_Money_Flow_Sum > 8.21744e+08 )
								if( Money_Flow_Ratio <= 3.46953 )
									ret := -0.700000 // sell
								if( Money_Flow_Ratio > 3.46953 )
									ret := 0.142857
					if( Positive_Money_Flow > 1.04195e+08 )
						if( MFI_High <= 8.14729 )
							if( Typical_Price <= 390.461 )
								ret := 1.000000 // buy
							if( Typical_Price > 390.461 )
								if( MA_Cross <= 12.9149 )
									ret := -0.291139
								if( MA_Cross > 12.9149 )
									ret := -1.000000 // sell
						if( MFI_High > 8.14729 )
							if( Negative_Money_Flow_Sum <= 4.11215e+06 )
								ret := -0.571429
							if( Negative_Money_Flow_Sum > 4.11215e+06 )
								if( Raw_Money_Flow <= 2.40077e+08 )
									ret := 0.777778 // buy
								if( Raw_Money_Flow > 2.40077e+08 )
									ret := 0.000000
				if( Long_MA > 417.499 )
					if( Negative_Money_Flow_Sum <= 1.67716e+08 )
						if( MFI_Low <= 25.6843 )
							if( Positive_Money_Flow_Sum <= 1.02491e+08 )
								if( Short_Long_Diff <= -0.20131 )
									ret := 0.449612
								if( Short_Long_Diff > -0.20131 )
									ret := 0.080000
							if( Positive_Money_Flow_Sum > 1.02491e+08 )
								if( Short_Long_Diff <= -0.046911 )
									ret := 0.822222 // buy
								if( Short_Long_Diff > -0.046911 )
									ret := -0.200000
						if( MFI_Low > 25.6843 )
							if( MA_Cross <= 42.3263 )
								if( Short_Long_Diff <= 0.382128 )
									ret := 0.091340
								if( Short_Long_Diff > 0.382128 )
									ret := 0.789474 // buy
							if( MA_Cross > 42.3263 )
								if( Money_Flow_Ratio <= 3.00511 )
									ret := 0.552846
								if( Money_Flow_Ratio > 3.00511 )
									ret := -0.333333
					if( Negative_Money_Flow_Sum > 1.67716e+08 )
						if( Long_MA <= 417.793 )
							if( Short_Long_Diff <= -0.660881 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.660881 )
								if( Short_MA <= 417.362 )
									ret := 0.400000
								if( Short_MA > 417.362 )
									ret := -0.625000
						if( Long_MA > 417.793 )
							if( Long_MA <= 460.734 )
								if( Positive_Money_Flow_Sum <= 3.71456e+08 )
									ret := 0.024765
								if( Positive_Money_Flow_Sum > 3.71456e+08 )
									ret := -0.225275
							if( Long_MA > 460.734 )
								if( Positive_Money_Flow_Sum <= 1.10686e+08 )
									ret := -0.894737 // sell
								if( Positive_Money_Flow_Sum > 1.10686e+08 )
									ret := -0.100000
		if( Short_Long_Diff > 0.392351 )
			if( Long_MA <= 415.387 )
				if( Positive_Money_Flow_Sum <= 4.44687e+06 )
					if( MFI <= 64.117 )
						if( Negative_Money_Flow_Sum <= 4.64943e+06 )
							if( Positive_Money_Flow_Sum <= 1.98046e+06 )
								if( Typical_Price <= 407.653 )
									ret := 0.400000
								if( Typical_Price > 407.653 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.98046e+06 )
								if( Long_MA <= 402.347 )
									ret := 0.378378
								if( Long_MA > 402.347 )
									ret := 0.716814 // buy
						if( Negative_Money_Flow_Sum > 4.64943e+06 )
							if( MFI <= 29.0289 )
								ret := 0.833333 // buy
							if( MFI > 29.0289 )
								if( Short_MA <= 407.465 )
									ret := -1.000000 // sell
								if( Short_MA > 407.465 )
									ret := 0.166667
					if( MFI > 64.117 )
						if( Negative_Money_Flow_Sum <= 1.10349e+06 )
							if( Positive_Money_Flow <= 197810 )
								if( Positive_Money_Flow <= 101735 )
									ret := -0.279070
								if( Positive_Money_Flow > 101735 )
									ret := -0.739130 // sell
							if( Positive_Money_Flow > 197810 )
								if( Long_MA <= 406.696 )
									ret := 0.800000 // buy
								if( Long_MA > 406.696 )
									ret := -0.080000
						if( Negative_Money_Flow_Sum > 1.10349e+06 )
							if( Positive_Money_Flow <= 459418 )
								if( Raw_Money_Flow <= 468663 )
									ret := 0.604396
								if( Raw_Money_Flow > 468663 )
									ret := -0.363636
							if( Positive_Money_Flow > 459418 )
								if( Positive_Money_Flow_Sum <= 4.06656e+06 )
									ret := -0.636364
								if( Positive_Money_Flow_Sum > 4.06656e+06 )
									ret := 0.250000
				if( Positive_Money_Flow_Sum > 4.44687e+06 )
					if( Typical_Price <= 389.322 )
						if( Short_Long_Diff <= 1.15307 )
							ret := 1.000000 // buy
						if( Short_Long_Diff > 1.15307 )
							if( Short_MA <= 387.039 )
								ret := 0.000000
							if( Short_MA > 387.039 )
								ret := 1.000000 // buy
					if( Typical_Price > 389.322 )
						if( Raw_Money_Flow <= 6.71659e+07 )
							if( Negative_Money_Flow_Sum <= 3.73335e+06 )
								if( Positive_Money_Flow_Sum <= 1.19572e+07 )
									ret := -0.060377
								if( Positive_Money_Flow_Sum > 1.19572e+07 )
									ret := -0.688889
							if( Negative_Money_Flow_Sum > 3.73335e+06 )
								if( Positive_Money_Flow <= 1.46927e+07 )
									ret := 0.046614
								if( Positive_Money_Flow > 1.46927e+07 )
									ret := -0.141066
						if( Raw_Money_Flow > 6.71659e+07 )
							if( Money_Flow_Ratio <= 2.58604 )
								if( Negative_Money_Flow_Sum <= 2.78763e+08 )
									ret := 0.631579
								if( Negative_Money_Flow_Sum > 2.78763e+08 )
									ret := -0.156250
							if( Money_Flow_Ratio > 2.58604 )
								if( Short_MA <= 412.031 )
									ret := 0.830508 // buy
								if( Short_MA > 412.031 )
									ret := 0.086957
			if( Long_MA > 415.387 )
				if( Long_MA <= 456.427 )
					if( Negative_Money_Flow_Sum <= 873630 )
						if( Short_Long_Diff <= 0.478016 )
							if( Negative_Money_Flow <= 297264 )
								if( Raw_Money_Flow <= 110489 )
									ret := 0.153846
								if( Raw_Money_Flow > 110489 )
									ret := -0.413793
							if( Negative_Money_Flow > 297264 )
								ret := 0.428571
						if( Short_Long_Diff > 0.478016 )
							if( Typical_Price <= 437.125 )
								if( Short_Long_Diff <= 1.22191 )
									ret := -0.702970 // sell
								if( Short_Long_Diff > 1.22191 )
									ret := 0.000000
							if( Typical_Price > 437.125 )
								if( Raw_Money_Flow <= 330756 )
									ret := 0.600000
								if( Raw_Money_Flow > 330756 )
									ret := -0.333333
					if( Negative_Money_Flow_Sum > 873630 )
						if( Short_Long_Diff <= 0.508416 )
							if( Positive_Money_Flow_Sum <= 7.9494e+07 )
								if( MFI_High <= -17.058 )
									ret := -0.254098
								if( MFI_High > -17.058 )
									ret := -0.039216
							if( Positive_Money_Flow_Sum > 7.9494e+07 )
								if( Long_MA <= 441.432 )
									ret := -0.010091
								if( Long_MA > 441.432 )
									ret := 0.215470
						if( Short_Long_Diff > 0.508416 )
							if( Positive_Money_Flow_Sum <= 2.80195e+08 )
								if( Negative_Money_Flow_Sum <= 2.15733e+08 )
									ret := -0.185669
								if( Negative_Money_Flow_Sum > 2.15733e+08 )
									ret := -0.563380
							if( Positive_Money_Flow_Sum > 2.80195e+08 )
								if( MFI_High <= 5.66173 )
									ret := -0.121451
								if( MFI_High > 5.66173 )
									ret := 0.315353
				if( Long_MA > 456.427 )
					if( Long_MA <= 463.898 )
						if( MFI <= 85.6745 )
							if( Short_Long_Diff <= 0.784794 )
								if( MFI_Low <= 48.063 )
									ret := -0.181818
								if( MFI_Low > 48.063 )
									ret := 0.525641
							if( Short_Long_Diff > 0.784794 )
								if( Positive_Money_Flow_Sum <= 2.97352e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.97352e+08 )
									ret := -0.500000
						if( MFI > 85.6745 )
							if( Typical_Price <= 459.86 )
								ret := 0.500000
							if( Typical_Price > 459.86 )
								if( Positive_Money_Flow <= 155126 )
									ret := -0.555556
								if( Positive_Money_Flow > 155126 )
									ret := 0.000000
					if( Long_MA > 463.898 )
						if( MFI_Low <= 25.9126 )
							if( Negative_Money_Flow_Sum <= 1.47141e+09 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.47141e+09 )
								ret := 0.000000
						if( MFI_Low > 25.9126 )
							if( Long_MA <= 464.09 )
								ret := -1.000000 // sell
							if( Long_MA > 464.09 )
								if( Negative_Money_Flow_Sum <= 8.38074e+07 )
									ret := -0.108108
								if( Negative_Money_Flow_Sum > 8.38074e+07 )
									ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_MSFT_1Min_6504a676(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


